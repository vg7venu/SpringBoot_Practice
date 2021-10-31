package com.springed.demo;

import com.springed.demo.scope.PersonDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScopeDemoApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(ScopeDemoApplication.class);

	public static void main(String[] args) {
		// int val = 0;
		ApplicationContext applicationContext = SpringApplication.run(ScopeDemoApplication.class, args);

		PersonDao personDao = applicationContext.getBean(PersonDao.class);
		PersonDao personDao2 = applicationContext.getBean(PersonDao.class);

		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao2);

		LOGGER.info("{}", personDao.getJdbcConnection());
		LOGGER.info("{}", personDao2.getJdbcConnection());

	}

}