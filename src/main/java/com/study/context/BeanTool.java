package com.study.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanTool implements ApplicationContextAware {

    private static ApplicationContext applicationContext;
    private static String name;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.applicationContext = applicationContext;
    }

    public static <T> T getBean(Class<T> requiredType) {

        return applicationContext.getBean(requiredType);
    }

    public static void main(String[] args) {
        String s = "2ewjdwerw";
        System.out.println(s);
        System.out.println(s);

        String.format(s, 111);
        name = "13e2332";


    }

}
