package com.springed.demopackage;

import com.springed.componentscan.ComponentPersonDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @SpringBootApplication
@Configuration
@ComponentScan("com.springed.componentscan")
public class ComponentScannerApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(ComponentScannerApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ComponentScannerApplication.class)) {

			ComponentPersonDao personDao = applicationContext.getBean(ComponentPersonDao.class);
			ComponentPersonDao personDao2 = applicationContext.getBean(ComponentPersonDao.class);

			LOGGER.info("{}", personDao);
			System.out.println(personDao.getJdbcConnection());
			System.out.println(personDao2.getJdbcConnection());
		}
		// ApplicationContext applicationContext =
		// SpringApplication.run(ComponentScannerApplication.class, args);
	}

}