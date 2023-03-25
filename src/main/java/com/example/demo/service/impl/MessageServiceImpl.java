package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Message;
import com.example.demo.repositroy.MessageRepositroy;
import com.example.demo.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService{

	@Autowired
	private MessageRepositroy messageRepositroy;
	
	@Override
	public Message saveMessage(Message message) {
		messageRepositroy.save(message);
		return message;
	}

}
