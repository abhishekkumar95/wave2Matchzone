package com.stackroute.matchzone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchzone.model.Location;

@CrossOrigin("*")
@RestController
public class LocationController {
	
	@Autowired
    private KafkaTemplate<String, Location> kafkaTemplate;

	static final String topic="loc_data";

    @PostMapping("/api/v1/loc")
    public String post(@RequestBody Location location) {

        kafkaTemplate.send(topic , location);

        return "Published successfully";
    }

}
