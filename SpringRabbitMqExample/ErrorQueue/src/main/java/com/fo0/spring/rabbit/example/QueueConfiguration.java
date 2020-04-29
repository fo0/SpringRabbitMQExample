package com.fo0.spring.rabbit.example;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
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
				.deadLetterExchange("")
				.deadLetterRoutingKey(CONSTANTS_QUEUE.QUEUE_MESSAGES_DLQ)
				.build();
		//@formatter:on
	}

	@Bean
	public Queue deadLetterQueue() {
		return QueueBuilder.nonDurable(CONSTANTS_QUEUE.QUEUE_MESSAGES_DLQ).build();
	}

	@Bean
	public DirectExchange messagesExchange() {
		return new DirectExchange(CONSTANTS_QUEUE.EXCHANGE_MESSAGES, false, true);
	}

	@Bean
	public Binding bindingMessages() {
		return BindingBuilder.bind(messagesQueue()).to(messagesExchange()).with(CONSTANTS_QUEUE.QUEUE_MESSAGES);
	}

}
