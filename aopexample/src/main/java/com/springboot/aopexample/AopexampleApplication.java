package com.springboot.aopexample;

import com.springboot.aopexample.business.Business1;
import com.springboot.aopexample.business.Business2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopexampleApplication implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(AopexampleApplication.class);

	@Autowired
	private Business1 business1;

	@Autowired
	private Business2 business2;

	public static void main(String[] args) {
		SpringApplication.run(AopexampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		log.info(business1.calculateSomething());
		log.info(business2.calculateSomething());
	}

}
