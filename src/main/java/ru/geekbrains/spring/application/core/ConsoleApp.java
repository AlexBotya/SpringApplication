package ru.geekbrains.spring.application.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConsoleApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConsoleAppConfiguration.class);
        AppProcessor appProcessor = context.getBean(AppProcessor.class);
        appProcessor.appProceed();

    }

}
