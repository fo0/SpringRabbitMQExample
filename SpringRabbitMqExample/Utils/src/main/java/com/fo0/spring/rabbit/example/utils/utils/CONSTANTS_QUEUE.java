package com.fo0.spring.rabbit.example.utils.utils;

import java.util.Properties;

public class CONSTANTS_QUEUE {

	public static final String QUEUE_MESSAGES = "baeldung-messages-queue";
	public static final String QUEUE_MESSAGES_DLQ = QUEUE_MESSAGES + ".dlq";
	public static final String EXCHANGE_MESSAGES = "baeldung-messages-exchange";

	public static final Properties BOOT_PROPS = new Properties() {
		private static final long serialVersionUID = 2903647352372544794L;
		{
			put("spring.rabbitmq.listener.simple.default-requeue-rejected", "false");
		}
	};
}
