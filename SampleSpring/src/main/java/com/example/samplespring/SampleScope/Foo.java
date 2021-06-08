//package com.example.samplespring.SampleScope;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//public class Foo {
//    public void init() {
//        System.out.println("init Foo");
//        // initialization logic
//    }
//    public void cleanup() {
//        System.out.println("cleanup Foo");
//        // destruction logic
//    }
//}
//@Configuration
//public class AppConfig1 {
//    @Bean(initMethod = "init", destroyMethod = "cleanup" )
//    public Foo foo() {
//        return new Foo();
//    }
//}
