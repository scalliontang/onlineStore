package com.sicongtang.onlineShop;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sicongtang.onlineShop.log.PaymentAction;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    }
}

