package com.example.demo.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Message;

@Repository
public interface MessageRepositroy extends JpaRepository<Message, Integer>{
	
}
