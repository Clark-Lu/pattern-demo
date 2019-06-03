package com.clark.pattern.demo.singleton;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

/**
 * created by LuChang
 * 2019/6/3 11:15
 */
public class SingletonTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(InnerClassSingleton.getSingleton().equals(InnerClassSingleton.getSingleton()));
        System.out.println(EnumSingleton.getSingleton().equals(EnumSingleton.getSingleton()));
        System.out.println(LockSingleton.getSingleton().equals(LockSingleton.getSingleton()));
        CompletableFuture<LockSingleton> singleton1 = CompletableFuture.supplyAsync(LockSingleton::getSingleton);
        CompletableFuture<LockSingleton> singleton2 = CompletableFuture.supplyAsync(LockSingleton::getSingleton);
        System.out.println(singleton1.get().equals(singleton2.get()));
        int size = 100;
        CountDownLatch countDownLatch = new CountDownLatch(size);
        ExecutorService executorService = Executors.newFixedThreadPool(size);
        List<Future> list = new ArrayList<>(size);
        List<Initializer> initializerList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            Initializer initializer = new Initializer(countDownLatch);
            initializerList.add(initializer);
            Future<?> submit = executorService.submit(initializer);
            list.add(submit);
        }
        for (Future future : list){
            future.get();
        }
        executorService.shutdown();
        Set<LockSingleton> lockSingletonSet = new HashSet<>();
        for (Initializer initializer : initializerList){
           lockSingletonSet.add(initializer.getLockSingleton());
        }
        System.out.println(lockSingletonSet.size());
    }

    static class Initializer implements Runnable{

        private LockSingleton lockSingleton;

        private CountDownLatch countDownLatch;

        public Initializer(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            try {
                this.countDownLatch.countDown();
                this.countDownLatch.await();
                lockSingleton = LockSingleton.getSingleton();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public LockSingleton getLockSingleton() {
            return lockSingleton;
        }
    }

}
