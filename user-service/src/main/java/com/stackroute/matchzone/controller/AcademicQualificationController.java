package com.stackroute.matchzone.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchzone.model.Academic;

@CrossOrigin("*")
@RestController
public class AcademicQualificationController {
	@Autowired
	private KafkaTemplate<String, Academic> kafkaTemplate;


	static final String topic="acad_data";

	@PostMapping("/api/v1/acad")
	public String post(@RequestBody Academic academic) {

		System.out.println(academic);
	    kafkaTemplate.send(topic , academic);

	    return "Published successfully";
	}
	
}
