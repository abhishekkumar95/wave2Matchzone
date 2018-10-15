package com.stackroute.matchzone.consumerservicelistener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.stackroute.matchzone.exception.UserAlreadyExistsException;
import com.stackroute.matchzone.model.User;
import com.stackroute.matchzone.service.UserAuthenticationService;

@Service
public class KafkaConsumerListener 
{
	@Autowired
	private UserAuthenticationService userAuthenticationService;
	
	//Listener method for topic register_data
	@KafkaListener(topics = "register_data")
	public void consumeJson(@Payload User user)
	{
		try 
		{
			userAuthenticationService.saveUser(user);
		} catch (UserAlreadyExistsException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
