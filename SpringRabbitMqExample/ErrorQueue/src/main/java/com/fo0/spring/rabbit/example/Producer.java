package com.fo0.spring.rabbit.example;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fo0.spring.rabbit.example.utils.utils.CONSTANTS_QUEUE;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class Producer {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void sendMessage() {
		//@formatter:off
		log.info("Sending message...");
		rabbitTemplate.convertAndSend(CONSTANTS_QUEUE.EXCHANGE_MESSAGES, CONSTANTS_QUEUE.QUEUE_MESSAGES, "Some message id");
		log.info("Sending message... success");
		//@formatter:on
	}
}