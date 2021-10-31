package com.springed.demopackage;

import com.springed.demopackage.basic.MainPrinterImpl;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @SpringBootApplication
@Configuration
@ComponentScan
public class BasicDemoApplication {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BasicDemoApplication.class)) {

			// ApplicationContext applicationContext =
			// SpringApplication.run(BasicDemoApplication.class, args);
			MainPrinterImpl printingJob = applicationContext.getBean(MainPrinterImpl.class);
			printingJob.execute();
			System.out.println(printingJob);

			MainPrinterImpl printingJob2 = applicationContext.getBean(MainPrinterImpl.class);
			printingJob.execute();
			System.out.println(printingJob2);
			applicationContext.close();
		}

	}

}