package com.example.samplespring.HelloSpring;

import com.example.samplespring.HelloSpring.HelloSpring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloSpringConfiguration {


    @Bean
    public HelloSpring createHelloSpringBean(){
        return new HelloSpring();
    }
}
