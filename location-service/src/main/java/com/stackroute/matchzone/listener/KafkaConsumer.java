package com.stackroute.matchzone.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.matchzone.model.Location;

@Service
public class KafkaConsumer {
	
	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@Autowired
	private KafkaProducer kafkaProducer;
	
    @KafkaListener(topics = "Location_Data", containerFactory = "locationKafkaListenerFactory")
	public void consumeJson(Location location) {
		LOG.info("Consumed JSON message='{}'", location);
		//kafkaProducer.post(location);
	}
}
