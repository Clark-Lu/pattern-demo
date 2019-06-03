package com.clark.pattern.demo.example.strategy.impl;

import com.clark.pattern.demo.example.strategy.StrategyService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * created by LuChang
 * 2019/6/3 10:05
 */
@Component
public class StrategyTwo implements StrategyService {
    @Override
    public List<Long> getGoodsIdListByUserId(Long userId, Integer offset, Integer pageSize) {
        System.out.println("strategy two return");
        return Arrays.asList(2L,22L,222L,2222L);
    }
}
