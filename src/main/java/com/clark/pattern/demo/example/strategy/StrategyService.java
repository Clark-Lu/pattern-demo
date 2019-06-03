package com.clark.pattern.demo.example.strategy;

import java.util.List;

/**
 * created by LuChang
 * 2019/6/3 10:00
 */
public interface StrategyService {

    List<Long> getGoodsIdListByUserId(Long userId, Integer offset, Integer pageSize);

}
