package com.clark.pattern.demo.example.strategy;

import com.clark.pattern.demo.BaseTest;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * created by LuChang
 * 2019/6/3 10:29
 */
public class StrategyRouterTest extends BaseTest {

    @Resource
    private StrategyRouter strategyRouter;

    @Test
    public void test() throws JsonProcessingException {
        List<Long> goodsIdList = strategyRouter.getGoodsIdByStrategyIdAndUserId(1L, 1L, 0, 1);
        Assert.assertEquals(goodsIdList.size(), 1);
        System.out.println(objectMapper.writeValueAsString(goodsIdList));
        goodsIdList = strategyRouter.getGoodsIdByStrategyIdAndUserId(2L,1L,0,10);
        System.out.println(objectMapper.writeValueAsString(goodsIdList));
    }

}
