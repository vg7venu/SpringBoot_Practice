package com.springed.demopackage;

import com.springed.componentscan.ComponentPersonDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springed.componentscan")
public class ComponentScannerApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(ComponentScannerApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ComponentScannerApplication.class, args);
		ComponentPersonDao personDao = applicationContext.getBean(ComponentPersonDao.class);

		LOGGER.info("{}", personDao);
	}

}