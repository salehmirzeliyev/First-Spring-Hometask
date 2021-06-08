package com.example.samplespring.LoggerComponentAutowiredExecutes1;

import com.example.samplespring.SampleComponentAndPostConstruct.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MainServiceImpl1 implements MainService {
    @Autowired
    ExecuteService executeService;

    @PostConstruct
    @Override
    public void postConstruct(){
        System.out.println("post construct");
        executeService.execute();
    }
}
