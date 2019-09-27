package com.study.handler;

import com.study.annoation.OrderType;
import com.study.enums.OrderTypeEnum;
import org.springframework.stereotype.Component;

@Component
@OrderType(OrderTypeEnum.TWO)
public class TwoHandler implements AbstractHandler {

    @Override
    public void handler() {

    }
}
