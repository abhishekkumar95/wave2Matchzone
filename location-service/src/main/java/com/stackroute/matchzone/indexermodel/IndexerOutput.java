package com.stackroute.matchzone.indexermodel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchzone.listener.KafkaConsumer;

import com.stackroute.matchzone.model.Location;

@RestController

public class IndexerOutput {

	@Autowired
	private KafkaTemplate<String,LocationIndex> kafkaTemplate;
	
	
	static final  String topic="loc1_data";
	
	@Autowired
	//RelationshipPropertyImplementation weightage;

	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);


	@KafkaListener(topics = "loc_data", groupId = "group_json", containerFactory = "locationKafkaListenerFactory")
	public void consumeJson(Location location) {
		//String location1= location.
		//LOG.info("Weightage is",weightage.weightageAssigner(skills));
		kafkaTemplate.send(topic,
				new LocationIndex(location.getUserName(),location.getCity()));
		LOG.info("Produced JSON message on indexer='{}'");

	}

}
