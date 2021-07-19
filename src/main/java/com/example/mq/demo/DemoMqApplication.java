package com.example.mq.demo;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMqApplication.class, args);
	}

	public static final String QUEUE = "play-queue";
	public static final String EXCHANGE = "play-exchange";
	public static final String ROUTING_KEY = "red"; // it is in fact the binding key
	
	@Bean
	Queue queue() {
		return new Queue(QUEUE, false);
	}
	
	@Bean
	DirectExchange exchange() {
		return new DirectExchange(EXCHANGE);
	}
	
	@Bean
	Binding binding(Queue queue, DirectExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
	}
}
