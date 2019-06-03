package com.clark.pattern.demo.example.strategy.impl;

import com.clark.pattern.demo.example.strategy.StrategyService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * created by LuChang
 * 2019/6/3 10:04
 */
@Component
public class StrategyOne implements StrategyService {
    @Override
    public List<Long> getGoodsIdListByUserId(Long userId, Integer offset, Integer pageSize) {
        System.out.println("strategy one return");
        return Arrays.asList(1L,11L,111L,1111L);
    }
}
