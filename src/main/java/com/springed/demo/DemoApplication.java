package com.springed.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);

		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		MainPrinterImpl printingJob = applicationContext.getBean(MainPrinterImpl.class);
		printingJob.execute();
		System.out.println(printingJob);

		MainPrinterImpl printingJob2 = applicationContext.getBean(MainPrinterImpl.class);
		printingJob.execute();
		System.out.println(printingJob2);
	}

}
