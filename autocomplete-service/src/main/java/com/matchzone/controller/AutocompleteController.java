package com.matchzone.controller;

import java.util.ArrayList;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matchzone.model.AcademicDetails;
import com.matchzone.model.Certification;
import com.matchzone.model.City;
import com.matchzone.model.Project;
import com.matchzone.model.Skill;
import com.matchzone.repository.AcademicDetailsRepository;
import com.matchzone.repository.CertificationRepository;
import com.matchzone.repository.CityRepository;
import com.matchzone.repository.ProjectRepository;
import com.matchzone.repository.SkillRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1")
public class AutocompleteController {
	
    private AcademicDetailsRepository academicDetailsRepository;
    private CertificationRepository certificationRepository;
    private CityRepository cityRepository;
    private ProjectRepository projectRepository;
    private SkillRepository skillRepository; 
    @Autowired
    public AutocompleteController(AcademicDetailsRepository academicDetailsRepository,CertificationRepository certificationRepository,CityRepository cityRepository,ProjectRepository projectRepository, SkillRepository skillRepository ) {
    	super();
    	this.academicDetailsRepository = academicDetailsRepository;
    	this.certificationRepository = certificationRepository;
    	this.cityRepository = cityRepository;
    	this.projectRepository = projectRepository;
    	this.skillRepository = skillRepository;
    }
     
    @GetMapping("/skill/{stringvalue}")
    public List<Skill> skillAutoComplete(@PathVariable("stringvalue") String strvalue) {
        List<Skill> allSkills = new ArrayList<Skill>();
        List<Skill> autoSkills = new ArrayList<Skill>();
        Pattern regex = Pattern.compile("(" + strvalue.toLowerCase() + ")");
        allSkills = (List<Skill>) skillRepository.findAll();
        for (int i = 0; i < allSkills.size(); i++) {
            Matcher m = regex.matcher(allSkills.get(i).toString().toLowerCase());
            if (m.find()) {
                autoSkills.add(allSkills.get(i));
            }
        }
        return autoSkills;
    }
    

    @GetMapping("/project/{stringvalue}")
    public List<Project> projectAutoComplete(@PathVariable("stringvalue") String strvalue) {
        List<Project> allProjects = new ArrayList<Project>();
        List<Project> autoProjects = new ArrayList<Project>();
        Pattern regex = Pattern.compile("(" + strvalue.toLowerCase() + ")");
        allProjects = (List<Project>) projectRepository.findAll();
        for (int i = 0; i < allProjects.size(); i++) {
            Matcher m = regex.matcher(allProjects.get(i).toString().toLowerCase());
            if (m.find()) {
                autoProjects.add(allProjects.get(i));
                }
        }
        return autoProjects;   
    }

    @GetMapping("/city/{stringvalue}")
    public List<City> cityAutoComplete(@PathVariable("stringvalue") String strvalue) {
        List<City> allCities = new ArrayList<City>();
        List<City> autoCities = new ArrayList<City>();
        Pattern regex = Pattern.compile("(" + strvalue.toLowerCase() + ")");
        allCities = (List<City>) cityRepository.findAll();
        for (int i = 0; i < allCities.size(); i++) {
            Matcher m = regex.matcher(allCities.get(i).toString().toLowerCase());
            if (m.find()) {
                autoCities.add(allCities.get(i));
                }
        }
        return autoCities;   
    }
    
    @GetMapping("/certification/{stringvalue}")
    public List<Certification> certificationAutoComplete(@PathVariable("stringvalue") String strvalue) {
        List<Certification> allCertification = new ArrayList<Certification>();
        List<Certification> autoCertification = new ArrayList<Certification>();
        Pattern regex = Pattern.compile("(" + strvalue.toLowerCase() + ")");
        allCertification = (List<Certification>) certificationRepository.findAll();
        for (int i = 0; i < allCertification.size(); i++) {
            Matcher m = regex.matcher(allCertification.get(i).toString().toLowerCase());
            if (m.find()) {
                autoCertification.add(allCertification.get(i));
                }
        }
        return autoCertification;   
    }
    
    @GetMapping("/academicDetails/{stringvalue}")
    public List<AcademicDetails> academicDetailsAutoComplete(@PathVariable("stringvalue") String strvalue) {
        List<AcademicDetails> allAcademicDetails = new ArrayList<AcademicDetails>();
        List<AcademicDetails> autoAcademicDetails = new ArrayList<AcademicDetails>();
        Pattern regex = Pattern.compile("(" + strvalue.toLowerCase() + ")");
        allAcademicDetails = (List<AcademicDetails>) academicDetailsRepository.findAll();
        for (int i = 0; i < allAcademicDetails.size(); i++) {
            Matcher m = regex.matcher(allAcademicDetails.get(i).toString().toLowerCase());
            if (m.find()) {
                autoAcademicDetails.add(allAcademicDetails.get(i));
                }
        }
        return autoAcademicDetails;   
    }
}
