package com.stackroute.matchzone.indexermodel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchzone.listener.KafkaConsumer;
import com.stackroute.matchzone.model.Academic;

@RestController

public class IndexerOutput {

	@Autowired
	private KafkaTemplate<String,AcademicIndex> kafkaTemplate;
	
	
	static final  String topic="acad1_data";
	
	@Autowired
	//RelationshipPropertyImplementation weightage;

	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);


	@KafkaListener(topics = "acad_data", groupId = "group_json", containerFactory = "academicKafkaListenerFactory")
	public void consumeJson(Academic academic) {
		//String academics= academic.getCourse();
		//LOG.info("Weightage is",weightage.weightageAssigner(skills));
		kafkaTemplate.send(topic,
				new AcademicIndex(academic.getUniversityInstitute(),academic.getUserName()));
		LOG.info("Produced JSON message on indexer='{}'");

	}

}
