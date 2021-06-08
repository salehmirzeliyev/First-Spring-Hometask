package com.example.samplespring.Qualifier;

import com.example.samplespring.LoggerComponentAutowiredExecutes1.ExecuteService;
import com.example.samplespring.Qualifier.ExecuteServiceImpl2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ExecutorServiceImpl3 implements ExecuteService {
        Logger logger = LoggerFactory.getLogger(ExecuteServiceImpl2.class);


        @Override
        public void execute() {
            logger.info("execute on ExecuteServiceImpl2+++++");
        }
    }

