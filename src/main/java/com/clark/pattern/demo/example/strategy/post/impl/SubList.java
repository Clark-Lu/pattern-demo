package com.clark.pattern.demo.example.strategy.post.impl;

import com.clark.pattern.demo.example.strategy.post.PostProcess;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * created by LuChang
 * 2019/6/3 10:14
 */
@Component
public class SubList implements PostProcess {
    @Override
    public List<Long> process(Long userId, Integer offset, Integer pageSize, List<Long> goodsIdList) {
        System.out.println("subList return");
        if (offset != null && pageSize != null) {
            int end = offset + pageSize;
            if (end < 0){
                end = goodsIdList.size();
            }
            if (end > goodsIdList.size()){
                end = goodsIdList.size();
            }
            if (offset > end){
                offset = end;
            }
            return goodsIdList.subList(offset, end);
        }else {
            return goodsIdList;
        }
    }
}
