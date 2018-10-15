package com.stackroute.matchzone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchzone.model.PersonalInfo;

@CrossOrigin("*")
@RestController
public class PersonalInfoController {
	
	@Autowired
    private KafkaTemplate<String, PersonalInfo> kafkaTemplate;

	
	static final String topic="person_data";

    @PostMapping("/api/v1/person")
    public String post(@RequestBody PersonalInfo perInfo) {

        kafkaTemplate.send(topic , perInfo);

        return "Published successfully";
    }

}
