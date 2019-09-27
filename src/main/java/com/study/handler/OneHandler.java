package com.study.handler;

import com.study.annoation.OrderType;
import com.study.enums.OrderTypeEnum;
import org.springframework.stereotype.Component;

@Component
@OrderType(OrderTypeEnum.ONE)
public class OneHandler implements AbstractHandler {

    @Override
    public void handler() {
        System.out.println("执行逻辑1");
    }
}
