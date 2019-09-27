package com.study.service;

import com.study.context.OrderContext;
import com.study.entity.User;
import com.study.enums.OrderTypeEnum;
import com.study.handler.AbstractHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class OrderService {

    @Autowired(required = false)
    private OrderContext orderContext;

    @RequestMapping("/test")
    public void excute(User user){
        user.setOrderType(OrderTypeEnum.ONE);
        AbstractHandler abstractHandler = orderContext.getInstance(user.getOrderType());
        abstractHandler.handler();
    }
}
