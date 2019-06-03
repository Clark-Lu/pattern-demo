package com.clark.pattern.demo.example.strategy;

import com.clark.pattern.demo.example.strategy.impl.StrategyOne;
import com.clark.pattern.demo.example.strategy.impl.StrategyTwo;
import com.clark.pattern.demo.example.strategy.post.PostProcess;
import com.clark.pattern.demo.example.strategy.post.impl.PostProcessOne;
import com.clark.pattern.demo.example.strategy.post.impl.PostProcessTwo;
import com.clark.pattern.demo.example.strategy.post.impl.SubList;

/**
 * created by LuChang
 * 2019/6/3 10:17
 */
public enum StrategyEnum {

    STRATEGY_ONE(1L, StrategyOne.class, PostProcessOne.class, SubList.class),

    STRATEGY_TWO(2L, StrategyTwo.class, PostProcessTwo.class);

    private long strategyId;

    private Class<? extends StrategyService> service;

    private Class<? extends PostProcess>[] postProcessors;

    StrategyEnum(long strategyId, Class<? extends StrategyService> service, Class<? extends PostProcess>... postProcessors) {
        this.strategyId = strategyId;
        this.service = service;
        this.postProcessors = postProcessors;
    }

    public long getStrategyId() {
        return strategyId;
    }


    public Class<? extends StrategyService> getService() {
        return service;
    }


    public Class<? extends PostProcess>[] getPostProcessors() {
        return postProcessors;
    }
}
