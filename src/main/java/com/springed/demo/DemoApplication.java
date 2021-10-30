package com.springed.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);

		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		MainPrinter printingJob = applicationContext.getBean(MainPrinter.class);
		System.out.print(printingJob);
	}

}
