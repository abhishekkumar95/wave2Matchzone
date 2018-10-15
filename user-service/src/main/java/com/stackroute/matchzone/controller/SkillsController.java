package com.stackroute.matchzone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchzone.model.Skills;

@CrossOrigin("*")
@RestController
public class SkillsController {
	
	@Autowired
    private KafkaTemplate<String, Skills> kafkaTemplate;


	static final String topic="skill_data";

    @PostMapping("/api/v1/skills")
    public String post(@RequestBody Skills skill) {

        kafkaTemplate.send(topic , skill);

        return "Published successfully";
    }

}
