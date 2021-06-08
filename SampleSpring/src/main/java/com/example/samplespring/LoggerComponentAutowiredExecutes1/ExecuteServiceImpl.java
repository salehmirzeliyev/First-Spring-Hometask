package com.example.samplespring.LoggerComponentAutowiredExecutes1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ExecuteServiceImpl implements ExecuteService {
    Logger logger = LoggerFactory.getLogger(ExecuteServiceImpl.class);


    @Override
    public void execute() {
        logger.info("execute on ExecuteServiceImpl");
    }
}
