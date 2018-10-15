/*package com.stackroute.matchzone.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchzone.model.Skills;

@RestController
@RequestMapping("kafka")
public class KafkaProducer {

	
	@Autowired
	private KafkaTemplate<String, Skills> kafkaTemplateskill;

	
	static final  String TOPIC="Skills_Data";


	@GetMapping("/publish/{name}")
	public String postskill(@PathVariable("name") final String name) {
		System.out.println("In kafka producer of skills");

		// publishing to kafka
		kafkaTemplateskill.send(TOPIC, new Skills(name, name, name, name, name, name));

		return "Published successfully";
	}
	

	@PostMapping("/publish")
	public String postskill(@RequestBody Skills skill) {
		System.out.println("In kafka producer of skills");

		// publishing to kafka
		kafkaTemplateskill.send(TOPIC, skill);

		return "Published successfully";
	}
	
	
}*/