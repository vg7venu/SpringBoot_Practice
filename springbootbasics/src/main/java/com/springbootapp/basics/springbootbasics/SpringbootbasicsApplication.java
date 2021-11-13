package com.springbootapp.basics.springbootbasics;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootbasicsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(SpringbootbasicsApplication.class, args);
		for (String name : appContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}

	}

}
