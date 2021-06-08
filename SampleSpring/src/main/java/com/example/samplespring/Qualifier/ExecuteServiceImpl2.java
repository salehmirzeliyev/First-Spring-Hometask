package com.example.samplespring.Qualifier;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ExecuteServiceImpl2 implements ExecuteService2 {
    Logger logger = LoggerFactory.getLogger(ExecuteServiceImpl2.class);


    @Override
    public void execute() {
        logger.info("execute on ExecuteServiceImpl");
    }
}
