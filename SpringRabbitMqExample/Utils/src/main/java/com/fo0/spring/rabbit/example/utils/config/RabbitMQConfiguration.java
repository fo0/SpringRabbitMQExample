package com.fo0.spring.rabbit.example.utils.config;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfiguration {

	@Bean
	public ConnectionFactory config() {
		CachingConnectionFactory config = new CachingConnectionFactory();
		config.setHost("localhost");
		config.setPort(4445);
		config.setUsername("guest");
		config.setPassword("guest");
		return config;
	}

}