package com.study.context;

import com.study.annoation.OrderType;
import com.study.enums.OrderTypeEnum;
import com.study.handler.AbstractHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class OrderPostProcessor implements BeanFactoryPostProcessor {

    private static final String PACKAGE = "com.study.handler";
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

        Map<OrderTypeEnum, Class> map = new HashMap<>();
        String[] beanDefinitionNames = configurableListableBeanFactory.getBeanDefinitionNames();
        for (String beanNames: beanDefinitionNames) {

            Class<?> type;
            type = configurableListableBeanFactory.getType(beanNames);
            if (AbstractHandler.class.isAssignableFrom(type)) {
                OrderTypeEnum value = type.getAnnotation(OrderType.class).value();
                map.put(value, type);
            }
        }

        OrderContext orderContext = new OrderContext(map);
        configurableListableBeanFactory.registerSingleton(orderContext.getClass().getName(), orderContext);
    }
}
