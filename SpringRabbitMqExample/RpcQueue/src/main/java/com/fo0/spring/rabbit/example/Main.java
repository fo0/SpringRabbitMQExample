package com.fo0.spring.rabbit.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

import com.fo0.spring.rabbit.example.utils.utils.CONSTANTS_QUEUE;

@SpringBootApplication
public class Main {

	@Autowired
	private Producer messageProducer;

	public static void main(String[] args) {
		new SpringApplicationBuilder(Main.class).properties(CONSTANTS_QUEUE.BOOT_PROPS).build().run(args);
	}

	@Bean
	public CommandLineRunner runner() {
		return args -> {
			messageProducer.sendMessage();
		};
	}

}
