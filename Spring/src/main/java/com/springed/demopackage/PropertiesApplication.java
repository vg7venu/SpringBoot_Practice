package com.springed.demopackage;

import com.springed.demopackage.propertiesapp.PropertiesPrint;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class PropertiesApplication {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                PropertiesApplication.class)) {

            PropertiesPrint test = context.getBean(PropertiesPrint.class);
            test.printTheUrl();
            context.close();
        }

    }
}
