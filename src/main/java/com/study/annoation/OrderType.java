package com.study.annoation;

import com.study.enums.OrderTypeEnum;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface OrderType {

    OrderTypeEnum value();
}
