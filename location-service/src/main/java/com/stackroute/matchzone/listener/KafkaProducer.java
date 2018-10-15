package com.stackroute.matchzone.listener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.stackroute.matchzone.indexermodel.LocationIndex;
import com.stackroute.matchzone.model.Location;


@Service
public class KafkaProducer {

    private static final Logger LOG = LoggerFactory.getLogger(KafkaProducer.class);
    
    @Autowired
    private KafkaTemplate<String, LocationIndex> kafkaTemplate;
    
    static final  String TOPIC="Location_Data";
 
    @KafkaListener(topics = "location_data", groupId = "group_json", containerFactory = "locationKafkaListenerFactory")
    public void consumeJson(Location location) {
    	
    	LocationIndex locationIndex = new LocationIndex(location.getUserName(), location.getCity());
		kafkaTemplate.send(TOPIC, locationIndex);
		LOG.info("LocationIndex message='{}'", locationIndex);
    }
     
}
