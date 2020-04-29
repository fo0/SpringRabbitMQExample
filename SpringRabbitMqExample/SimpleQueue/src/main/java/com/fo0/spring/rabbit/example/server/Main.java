package com.fo0.spring.rabbit.example.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(scanBasePackages = "com.fo0.example.spring.rabbitmq.main.server")
public class Main {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Main.class).build().run(args);
	}

}
