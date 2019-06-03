package com.clark.pattern.demo.example.strategy.post;

import java.util.List;

/**
 * created by LuChang
 * 2019/6/3 10:07
 */
public interface PostProcess {

    List<Long> process(Long userId, Integer offset, Integer pageSize, List<Long> goodsIdList);

}
