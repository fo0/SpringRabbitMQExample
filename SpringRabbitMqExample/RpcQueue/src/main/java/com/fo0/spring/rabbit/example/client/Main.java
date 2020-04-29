package com.fo0.spring.rabbit.example.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(scanBasePackages = "com.fo0.example.spring.rabbitmq.main.client")
public class Main {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Main.class).build().run(args);
	}

}
