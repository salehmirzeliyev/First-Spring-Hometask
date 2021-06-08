package com.example.samplespring.Qualifier;

import com.example.samplespring.Qualifier.ExecuteService2;
import com.example.samplespring.SampleComponentAndPostConstruct.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MainServiceImpl12 implements MainService {
    @Qualifier("executorServiceImpl3")
    @Autowired
    ExecuteService2 executeService;

    @PostConstruct
    @Override
    public void postConstruct(){
        System.out.println("post construct2");
        executeService.execute();
    }

    @PostConstruct
    public void postConstruct3(){
        executeService.execute();
    }

}
