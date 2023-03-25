package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Message;
import com.example.demo.service.MessageService;
import com.example.demo.service.ProducerService;

@RestController
@RequestMapping("/kafkaapp")
public class MessageController {
	
	@Autowired 
	ProducerService producerService;
	
	@Autowired
	MessageService messageService;
	
	@PostMapping(value="/post")
	public ResponseEntity<Message> saveEmployee(@RequestParam("msg") String msg){
		Message message = new Message(msg, "mytopic");
		producerService.publishToTopic(msg);
		return new ResponseEntity<Message>(messageService.saveMessage(message), HttpStatus.CREATED);
	}

}
