package com.example.samplespring.HelloSpring;

import com.example.samplespring.HelloSpring.HelloSpring;
import com.example.samplespring.HelloSpring.HelloSpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static ApplicationContext context;

    public static void main(String[] args) {

        context = new AnnotationConfigApplicationContext(HelloSpringConfiguration.class);

        HelloSpring helloSpringObject = context.getBean(HelloSpring.class);

        helloSpringObject.setMessage("Hello Spring!");
        helloSpringObject.getMessage();
    }
}
