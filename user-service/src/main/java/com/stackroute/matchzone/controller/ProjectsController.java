package com.stackroute.matchzone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchzone.model.Project;

@CrossOrigin("*")
@RestController
public class ProjectsController {

@Autowired
private KafkaTemplate<String, Project> kafkaTemplate;


static final String topic="project_data";

@PostMapping("/api/v1/proj")
public String post(@RequestBody Project project) {

	System.out.println(project);
    kafkaTemplate.send(topic , project);

    return "Published successfully";
}

}
