package com.stackroute.matchzone.indexermodel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchzone.listener.KafkaConsumer;
import com.stackroute.matchzone.model.Skills;

@RestController

public class IndexerOutput {

	@Autowired
	private KafkaTemplate<String, SkillIndex> kafkaTemplate;
	
	
	static final  String topic="skill1_data";
	
	

	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);


	@KafkaListener(topics = "skill_data", groupId = "group_json", containerFactory = "skillKafkaListenerFactory")
	public void consumeJson(Skills skill) {
		System.out.println("11111111111111111111111111111111111111111111111111111"+skill);
		String skills= skill.getiTSkills();
		
		kafkaTemplate.send(topic,
				new SkillIndex(skill.getUserName(),skill.getiTSkills()));
		LOG.info("Produced JSON message on indexer='{}'");

	}

}
