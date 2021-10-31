package com.springed.demopackage.cdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @SpringBootApplication
@Configuration
@ComponentScan
public class CDISpringAnnotationsApplication {
    private static Logger logger = LoggerFactory.getLogger(CDISpringAnnotationsApplication.class);

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                CDISpringAnnotationsApplication.class)) {

            // ApplicationContext applicationContext =
            // SpringApplication.run(CDISpringAnnotationsApplication.class, args);

            CDIImp test1 = applicationContext.getBean(CDIImp.class);

            logger.info("\n\n\n********This is the CDIImp class{}", test1);

            test1.getCdiDao().checking();
        }
    }

}
