package com.example.samplespring.SampleComponentAndPostConstruct;

import com.example.samplespring.SampleComponentAndPostConstruct.MainService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MainServiceImpl implements MainService {
    @PostConstruct
    @Override
    public void postConstruct(){
        System.out.println("post construct");
    }
}
