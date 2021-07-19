package com.example.mq.demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMQProducerController {
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	@GetMapping(value = "/produced")
	public String producer() {
		rabbitTemplate.convertAndSend(DemoMqApplication.EXCHANGE,DemoMqApplication.ROUTING_KEY,
				"I love Tom Cruise"); // pass the exchange, routing key and message, routing key is same as binding key in direct exchange
		return "Message published";
	}
	
	@RabbitListener(queues = DemoMqApplication.QUEUE)
	public void consumer(String message) {
		System.out.println("Message received = " + message);
	}
	
}
