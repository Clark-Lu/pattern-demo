package com.clark.pattern.demo.example.strategy;

import com.clark.pattern.demo.example.strategy.post.PostProcess;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * created by LuChang
 * 2019/6/3 10:03
 */
@Component
public class StrategyRouter implements InitializingBean {

    private static final Logger logger = LoggerFactory.getLogger(StrategyRouter.class);

    private static final Map<Long, StrategyService> serviceContainer = new HashMap<>();

    private static final Map<Long, List<PostProcess>>  postProcessorContainer = new HashMap<>();

    @Resource
    private ApplicationContext applicationContext;

    @Override
    public void afterPropertiesSet() {
        for (StrategyEnum strategyInfoEnum : StrategyEnum.values()){
            try {
                long strategyId = strategyInfoEnum.getStrategyId();
                serviceContainer.put(strategyId,  applicationContext.getBean(strategyInfoEnum.getService()));
                Class[] classes = strategyInfoEnum.getPostProcessors();
                List<PostProcess> postProcessList = new ArrayList<>();
                for (Class clazz : classes){
                    Object bean = applicationContext.getBean(clazz);
                    postProcessList.add((PostProcess) bean);
                }
                postProcessorContainer.put(strategyId,postProcessList);
            } catch (Throwable e) {
                logger.error("init strategy router error, ", e);
            }
        }
    }

    public List<Long> getGoodsIdByStrategyIdAndUserId(Long strategyId, Long userId, Integer offset, Integer pageSize) {
        if (serviceContainer.containsKey(strategyId)) {
            List<Long> goodsIdList = serviceContainer.get(strategyId).getGoodsIdListByUserId(userId, offset, pageSize);
            for (PostProcess postProcess : postProcessorContainer.get(strategyId)){
                goodsIdList = postProcess.process(userId,offset,pageSize,goodsIdList);
            }
            return goodsIdList;
        } else {
            return new ArrayList<>();
        }
    }

}
