package com.stackroute.matchzone.indexermodel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchzone.listener.KafkaConsumer;
import com.stackroute.matchzone.model.Certification;

@RestController

public class IndexerOutput {

	@Autowired
	private KafkaTemplate<String, CertificationIndex> kafkaTemplate;
	
	
	static final  String topic="certi1_data";
	
	
	@Autowired
	

	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);


	@KafkaListener(topics = "certi_data", groupId="group_json", containerFactory = "certificationKafkaListenerFactory")
	public void consumeJson(Certification certi) {
		kafkaTemplate.send(topic,
				new CertificationIndex(certi.getCertificationName(),certi.getUserName()));
		LOG.info("Produced JSON message on indexer='{}'");

	}

}
