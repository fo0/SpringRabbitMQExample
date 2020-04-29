package com.fo0.spring.rabbit.example;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.fo0.spring.rabbit.example.utils.utils.CONSTANTS_QUEUE;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class Listeners {

	@RabbitListener(queues = CONSTANTS_QUEUE.QUEUE_MESSAGES)
	public void processMessage() throws Exception {
		log.info("Received message and throwing exception");
		throw new Exception();
	}

	@RabbitListener(queues = CONSTANTS_QUEUE.QUEUE_MESSAGES_DLQ)
	public void processFailedMessages(Message message) {
		log.info("Received failed message: {}", message.toString());
	}

//	@Bean
//	public StatefulRetryOperationsInterceptor interceptor() {
//		return RetryInterceptorBuilder.StatefulRetryInterceptorBuilder.stateful().maxAttempts(1).build();
//	}

}
