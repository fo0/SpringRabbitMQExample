package com.fo0.spring.rabbit.example;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.fo0.spring.rabbit.example.utils.utils.CONSTANTS_QUEUE;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class Listeners {

	@RabbitListener(queues = CONSTANTS_QUEUE.QUEUE_MESSAGES)
	public void processMessage(String message) throws Exception {
		log.info("Received message " + message);
	}

//	@Bean
//	public StatefulRetryOperationsInterceptor interceptor() {
//		return RetryInterceptorBuilder.StatefulRetryInterceptorBuilder.stateful().maxAttempts(1).build();
//	}

}
