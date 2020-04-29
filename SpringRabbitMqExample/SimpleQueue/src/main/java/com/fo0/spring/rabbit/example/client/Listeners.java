package com.fo0.spring.rabbit.example.client;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Listeners {

	@Bean(name = "dx-client-a")
	public DirectExchange exchangeA() {
		return new DirectExchange("tut.rpc", false, true);
	}
	
	@Bean(name = "dx-client-b")
	public DirectExchange exchangeB() {
		return new DirectExchange("tut.rpc.type.b", false, true);
	}
	
	@Bean(name = "dx-client-c")
	public DirectExchange exchangeC() {
		return new DirectExchange("tut.rpc.type.c", false, true);
	}
	
	@Bean(name = "dx-client-d")
	public DirectExchange exchangeD() {
		return new DirectExchange("tut.rpc.type.d", false, true);
	}

}
