package com.fo0.spring.rabbit.example;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fo0.spring.rabbit.example.utils.utils.CONSTANTS_QUEUE;

@Configuration
public class QueueConfiguration {

	@Bean
	public Queue messagesQueue() {
		//@formatter:off
		return QueueBuilder
				.nonDurable(CONSTANTS_QUEUE.QUEUE_MESSAGES)
				.build();
		//@formatter:on
	}

}
