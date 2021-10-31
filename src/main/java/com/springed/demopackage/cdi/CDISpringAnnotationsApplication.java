package com.springed.demopackage.cdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CDISpringAnnotationsApplication {
    private static Logger logger = LoggerFactory.getLogger(CDISpringAnnotationsApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(CDISpringAnnotationsApplication.class, args);

        CDIImp test1 = applicationContext.getBean(CDIImp.class);

        logger.info("\n\n\n********This is the CDIImp class{}", test1);

        test1.getCdiDao().checking();
    }

}
