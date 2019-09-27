package com.study.entity;

import com.study.enums.OrderTypeEnum;

/**
 * 用户表
 */
public class User {

    private String name;

    private String sex;

    private OrderTypeEnum orderType;

    public OrderTypeEnum getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderTypeEnum orderType) {
        this.orderType = orderType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
