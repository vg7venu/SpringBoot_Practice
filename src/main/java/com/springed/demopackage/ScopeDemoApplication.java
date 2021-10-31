package com.springed.demopackage;

import com.springed.demopackage.scope.PersonDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @SpringBootApplication
@ComponentScan
@Configuration
public class ScopeDemoApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(ScopeDemoApplication.class);

	public static void main(String[] args) {
		// int val = 0;
		// ApplicationContext applicationContext =
		// SpringApplication.run(ScopeDemoApplication.class, args);
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ScopeDemoApplication.class)) {

			PersonDao personDao = applicationContext.getBean(PersonDao.class);
			PersonDao personDao2 = applicationContext.getBean(PersonDao.class);

			LOGGER.info("{}", personDao);
			LOGGER.info("{}", personDao2);

			LOGGER.info("{}", personDao.getJdbcConnection());
			LOGGER.info("{}", personDao2.getJdbcConnection());
		}

	}

}