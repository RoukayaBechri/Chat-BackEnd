package com.fpl.web;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fpl.dao.ConversationRepository;
import com.fpl.dao.MessageRepository;
import com.fpl.dao.UserRepository;
import com.fpl.entities.Conversation;
import com.fpl.entities.Message;
import com.fpl.entities.ConversationPK;
import com.fpl.entities.User;

@RestController
public class ConversationRestService {
	@Autowired
	private ConversationRepository conversationRepository;
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private MessageRepository messageRepository;
	
	
	@RequestMapping(value="/conversations", method=RequestMethod.GET)
	public List<Conversation> getAllMessage(){
		return conversationRepository.findAll();
	}
	
	}


