package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
	
	@KafkaListener(topics ="mytopic",groupId = "myGroup")	
	public void consumerFormTopic(String message) {
		System.out.println("Consumed message "+ message);
		
	}
}
