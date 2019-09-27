package com.study.context;

import com.study.enums.OrderTypeEnum;
import com.study.handler.AbstractHandler;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

public class OrderContext {

    private Map<OrderTypeEnum, Class> map = new HashMap<>();

    public OrderContext(Map<OrderTypeEnum, Class> map) {
        this.map = map;
    }

    public AbstractHandler getInstance(OrderTypeEnum orderTypeEnum) {
        Class<AbstractHandler> aClass = map.get(orderTypeEnum);
        return BeanTool.getBean(aClass);
    }
}
