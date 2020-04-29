package com.fo0.spring.rabbit.example.client;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class Producer {

	@Autowired
	private RabbitTemplate template;

	@Autowired
	private DirectExchange exchange;

	public Producer() {
		System.out.println("start");
	}
	
	@Bean
	public void send() {
		System.out.println(" [x] Requesting fib(" + 10 + ")");
		Integer response = (Integer) template.convertSendAndReceive(exchange.getName(), "rpc", 10);
		System.out.println(" [.] Got '" + response + "'");
	}

}
