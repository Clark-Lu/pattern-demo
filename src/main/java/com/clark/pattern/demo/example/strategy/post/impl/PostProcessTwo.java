package com.clark.pattern.demo.example.strategy.post.impl;

import com.clark.pattern.demo.example.strategy.post.PostProcess;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * created by LuChang
 * 2019/6/3 10:11
 */
@Component
public class PostProcessTwo implements PostProcess {
    @Override
    public List<Long> process(Long userId, Integer offset, Integer pageSize, List<Long> goodsIdList) {
        List<Long> list = new ArrayList<>(goodsIdList.size() + 1);
        list.addAll(goodsIdList);
        list.add(4L);
        System.out.println("post process two return");
        return list;
    }
}
