package com.stackroute.matchzone.controller;
/*package com.stackroute.matchzone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchzone.model.Experience;

@CrossOrigin("*")
@RequestMapping("/api/v1/experience")
@RestController
public class ExperienceController {
	
	@Autowired
    private KafkaTemplate<String, Experience> kafkaTemplate;

	@Value("${app.experience.name}")
    private String topic;

    @PostMapping("/publish")
    public String post(@RequestBody Experience exp) {

        kafkaTemplate.send(topic , exp);

        return "Published successfully";
    }

}
*/