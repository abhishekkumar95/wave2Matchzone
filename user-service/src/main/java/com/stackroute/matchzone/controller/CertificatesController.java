package com.stackroute.matchzone.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchzone.model.Certification;

@CrossOrigin("*")
@RestController
public class CertificatesController {
	
	@Autowired
	private KafkaTemplate<String, Certification> kafkaTemplate;


	static final String topic="certi_data";

	@PostMapping("/api/v1/certi")
	public String post(@RequestBody Certification certification) {

		System.out.println(certification);
	    kafkaTemplate.send(topic , certification);

	    return "Published successfully";
	}

}
