package com.clark.pattern.demo.example.strategy;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * created by LuChang
 * 2019/6/5 14:35
 */
@RestController
public class StrategyController {

    @Resource
    private StrategyRouter strategyRouter;

    @RequestMapping(value = "/strategy/{strategyId}",method = RequestMethod.GET)
    public List<Long> getGoodsIdListByStrategyId(@PathVariable("strategyId")Long strategyId){
        return strategyRouter.getGoodsIdByStrategyIdAndUserId(strategyId,null,null,null);
    }

}
