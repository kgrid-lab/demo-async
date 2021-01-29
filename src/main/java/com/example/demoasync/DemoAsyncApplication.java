package com.example.demoasync;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAsync
public class DemoAsyncApplication {

	@Autowired
	public MyCounter myCounter;

	public static void main(String[] args) {
		SpringApplication.run(DemoAsyncApplication.class, args);
	}

	@GetMapping
	String greet() {
		System.out.println("start counting");
		myCounter.mullItOver();
		System.out.println("done counting");
		return "Hello World!";
	}

}
