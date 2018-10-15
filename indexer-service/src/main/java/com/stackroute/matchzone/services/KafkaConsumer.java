package com.stackroute.matchzone.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.matchzone.indexermodel.AcademicIndex;
import com.stackroute.matchzone.indexermodel.CertificationIndex;
import com.stackroute.matchzone.indexermodel.LocationIndex;
import com.stackroute.matchzone.indexermodel.ProjectIndex;
import com.stackroute.matchzone.indexermodel.SkillIndex;
import com.stackroute.matchzone.nodes.Certi;
import com.stackroute.matchzone.nodes.City;
import com.stackroute.matchzone.nodes.Project;
/*import com.stackroute.matchzone.nodes.Company;*/
import com.stackroute.matchzone.nodes.UserName;
/*import com.stackroute.matchzone.nodes.Project;*/
import com.stackroute.matchzone.nodes.Skill;
import com.stackroute.matchzone.nodes.University;
/*import com.stackroute.matchzone.nodes.Training;
import com.stackroute.matchzone.nodes.University;
import com.stackroute.matchzone.relationships.EmployeeOfRelation;*/
import com.stackroute.matchzone.relationships.HasSkill;
import com.stackroute.matchzone.relationships.LivedInRelation;
import com.stackroute.matchzone.relationships.LivesInRelation;
import com.stackroute.matchzone.relationships.StudiedAtRelation;
import com.stackroute.matchzone.relationships.TrainingUndergone;
import com.stackroute.matchzone.relationships.WorkedInRelation;
/*import com.stackroute.matchzone.relationships.LivedInRelation;
import com.stackroute.matchzone.relationships.LivesInRelation;
import com.stackroute.matchzone.relationships.ProjectOfRelation;
import com.stackroute.matchzone.relationships.ProjectUsesSkillRelation;
import com.stackroute.matchzone.relationships.StudiedAtRelation;
import com.stackroute.matchzone.relationships.TrainingCoversSkill;
import com.stackroute.matchzone.relationships.TrainingUndergone;

import com.stackroute.matchzone.repositories.EmployeeOfRelationRepository;*/
import com.stackroute.matchzone.repositories.HasSkillRepository;
import com.stackroute.matchzone.repositories.LivedInRelationRepository;
import com.stackroute.matchzone.repositories.LivesInRelationRepository;
import com.stackroute.matchzone.repositories.StudiedAtRelationRepository;
import com.stackroute.matchzone.repositories.TrainingUndergoneRepository;
import com.stackroute.matchzone.repositories.WorkedInRelationRepository;
/*import com.stackroute.matchzone.repositories.ProjectOfRelationRepository;
import com.stackroute.matchzone.repositories.StudiedAtRelationRepository;
import com.stackroute.matchzone.repositories.TrainingCoversSkillRepository;
import com.stackroute.matchzone.repositories.TrainingUndergoneRepository;
import com.stackroute.matchzone.repositories.UsesSkillRelationRepository;
*/


@Service
public class KafkaConsumer {
	private HasSkillRepository hasSkillRepository;
	private TrainingUndergoneRepository trainingUndergoneRepository;
	/*private TrainingCoversSkillRepository trainingCoversSkillRepository;
	private EmployeeOfRelationRepository employeeOfRelationRepository;*/
	private LivesInRelationRepository livesInRelationRepository;
	
	private WorkedInRelationRepository workedInRelationRepository;
	private StudiedAtRelationRepository studiedAtRelationRepository;
	/*private UsesSkillRelationRepository usesSkillRelationRepository;
	private StudiedAtRelationRepository studiedAtRelationRepository;
	private ProjectOfRelationRepository projectOfRelationRepository;*/

	public KafkaConsumer() {
		super();
	}
	/*@Autowired
	public KafkaConsumer(HasSkillRepository hasSkillRepository, TrainingUndergoneRepository trainingUndergoneRepository,
			TrainingCoversSkillRepository trainingCoversSkillRepository,
			EmployeeOfRelationRepository employeeOfRelationRepository,
			LivesInRelationRepository livesInRelationRepository, LivedInRelationRepository livedInRelationRepository,
			WorkedInRelationRepository workedInRelationRepository,
			UsesSkillRelationRepository usesSkillRelationRepository,
			StudiedAtRelationRepository studiedAtRelationRepository,
			ProjectOfRelationRepository projectOfRelationRepository) {*/

	@Autowired
	public KafkaConsumer(HasSkillRepository hasSkillRepository,WorkedInRelationRepository workedInRelationRepository,TrainingUndergoneRepository trainingUndergoneRepository,StudiedAtRelationRepository studiedAtRelationRepository,LivesInRelationRepository livesInRelationRepository) {
		super();
		this.hasSkillRepository = hasSkillRepository;
		this.workedInRelationRepository = workedInRelationRepository;
		this.trainingUndergoneRepository = trainingUndergoneRepository;
		this.studiedAtRelationRepository = studiedAtRelationRepository;
		this.livesInRelationRepository = livesInRelationRepository;
		/*this.trainingCoversSkillRepository = trainingCoversSkillRepository;
		this.employeeOfRelationRepository = employeeOfRelationRepository;*/
//		
//		this.livedInRelationRepository = livedInRelationRepository;
		/*
		this.usesSkillRelationRepository = usesSkillRelationRepository;
		
		this.projectOfRelationRepository = projectOfRelationRepository;*/
	}

	@KafkaListener(topics = "String_Boo", groupId = "group_id", containerFactory = "kafkaListenerContainerFactory")
	public void consume(String message) {
		System.out.println("Consumed message: " + message);
	}

	/*@KafkaListener(topics = "Location_Data", groupId = "group_json", containerFactory = "locationKafkaListenerFactory")
	public void consumeJson(LocationIndex locationIndex) {
		System.out.println("Consumed JSON Message: " + locationIndex);
		UserName profileId = new UserName(locationIndex.getProfileId());
		City city = new City(locationIndex.getCity().toLowerCase());
		if (locationIndex.getMessage().equals("save") || locationIndex.getMessage().contains("update")) {
			if (locationIndex.getAddressType().equals("present")) {
				LivesInRelation livesInRelation = new LivesInRelation(locationIndex.getProfileId(), profileId, city);
				livesInRelationRepository.save(livesInRelation);
			} else {
				LivedInRelation livedInRelation = new LivedInRelation(locationIndex.getProfileId(), profileId, city);
				livedInRelationRepository.save(livedInRelation);

			}
		} else if (locationIndex.getMessage().contains("delete")) {
			if (locationIndex.getAddressType().equals("present")) {
				LivesInRelation livesInRelation = new LivesInRelation(locationIndex.getProfileId(), profileId, city);
				livesInRelationRepository.deleteById(livesInRelation.getLocationProfileId());
			} else {
				LivedInRelation livedInRelation = new LivedInRelation(locationIndex.getProfileId(), profileId, city);
				livedInRelationRepository.deleteById(livedInRelation.getLocationProfileId());

			}
		}

	}*/

	@KafkaListener(topics = "skill1_data", groupId = "group_json", containerFactory = "skillKafkaListenerFactory")
	public void consumeJson(SkillIndex skillIndex) {
		System.out.println("Consumed JSON Message: " + skillIndex);
		Skill skill = new Skill(skillIndex.getiTSkills().toLowerCase());
		System.out.println("Consumed JSON skill"+skill);
		UserName userName = new UserName(skillIndex.getUserName());
		System.out.println("Consumed JSON skill"+userName);
		HasSkill hasSkill = new HasSkill(userName,skill);
		System.out.println("Consumed JSON skill"+hasSkill);
		
		HasSkill hasSkill1=new HasSkill(userName,skill);
		hasSkillRepository.save(hasSkill1);
		
		
		
		}

	
	
	
	@KafkaListener(topics = "project1_data", groupId = "group_json", containerFactory = "projectKafkaListenerFactory")
	public void consumeJson(ProjectIndex projectIndex) {
		System.out.println("Consumed JSON Message: " + projectIndex);
		UserName userName = new UserName(projectIndex.getUserName());
	
		Project project=new Project(projectIndex.getProjectTitle());
		//UserName username=new UserName(projectIndex.getUserName());
		WorkedInRelation workedInRelation = new WorkedInRelation(userName,project);
//		
			workedInRelationRepository.save(workedInRelation);
//			usesSkillRelationRepository.save(projectUsesSkillRelation);
//			projectOfRelationRepository.save(projectOfRelation);
//		} else if (projectIndex.getMessage().contains("delete")) {
//			workedInRelationRepository.deleteById(workedInRelation.getRole());
//			usesSkillRelationRepository.deleteById(projectUsesSkillRelation.getProjectProfileId());
//			projectOfRelationRepository.deleteById(projectOfRelation.getProjectProfileId());
//		}

	}
	
	@KafkaListener(topics = "certi1_data", groupId = "group_json", containerFactory = "certificationKafkaListenerFactory")
	public void consumeJson(CertificationIndex certificationIndex) {
		System.out.println("Consumed JSON Message: " + certificationIndex);
		UserName userName = new UserName(certificationIndex.getUserName());
		Certi certi=new Certi(certificationIndex.getCertificationName());
		//UserName username=new UserName(certificationIndex.getUserName());
		TrainingUndergone certification = new TrainingUndergone(userName,certi);
		trainingUndergoneRepository.save(certification);
	}
	
	@KafkaListener(topics = "acad1_data", groupId = "group_json", containerFactory = "academicKafkaListenerFactory")
	public void consumeJson(AcademicIndex academicIndex) {
		System.out.println("Consumed JSON Message: " + academicIndex);
		UserName userName = new UserName(academicIndex.getUserName());
		University uni=new University(academicIndex.getUniversityInstitute());
	
		StudiedAtRelation univ = new StudiedAtRelation(userName,uni);
		studiedAtRelationRepository.save(univ);
	}
	
	
	@KafkaListener(topics = "loc1_data", groupId = "group_json", containerFactory = "locationKafkaListenerFactory")
	public void consumeJson(LocationIndex locationIndex) {
		System.out.println("Consumed JSON Message: " + locationIndex);
		UserName userName = new UserName(locationIndex.getUserName());
		City city=new City(locationIndex.getCity());
	
		LivesInRelation univ = new LivesInRelation(userName,city);
		livesInRelationRepository.save(univ);
	}


	/*@KafkaListener(topics = "TrainingIndexer", groupId = "group_json", containerFactory = "trainingKafkaListenerFactory")
	public void consumeJson(TrainingIndex trainingIndex) {
		System.out.println("Consumed JSON Message: " + trainingIndex);
		Skill skill = new Skill(trainingIndex.getSkills().toLowerCase());
		Training training = new Training(trainingIndex.getTrainingId(), trainingIndex.getTrainingName(),
				trainingIndex.getAuthority());
		ProfileId profileId = new ProfileId(trainingIndex.getProfileId());
		TrainingUndergone trainingUndergone = new TrainingUndergone(trainingIndex.getDuration(), profileId, training);
		TrainingCoversSkill trainingCoversSkill = new TrainingCoversSkill(trainingIndex.getWeight(), training, skill);
		if (trainingIndex.getMessage().equals("save") || trainingIndex.getMessage().contains("update")) {
			trainingUndergoneRepository.save(trainingUndergone);
			trainingCoversSkillRepository.save(trainingCoversSkill);
		} else if (trainingIndex.getMessage().contains("delete")) {
			trainingUndergoneRepository.deleteById(trainingUndergone.getDuration());
			trainingCoversSkillRepository.deleteById(trainingCoversSkill.getWeight());
		}

	}

	@KafkaListener(topics = "ExperienceIndexer", groupId = "group_json", containerFactory = "experienceKafkaListenerFactory")
	public void consumeJson(ExperienceIndex experienceIndex) {
		System.out.println("Consumed JSON Message: " + experienceIndex);
		ProfileId profileId = new ProfileId(experienceIndex.getProfileId());
		Company company = new Company(experienceIndex.getOrganizationName().toLowerCase());
		EmployeeOfRelation employeeOfRelation = new EmployeeOfRelation(experienceIndex.getRole(),
				experienceIndex.getDuration(), profileId, company);
		if (experienceIndex.getMessage().equals("save") || experienceIndex.getMessage().contains("update")) {
			employeeOfRelationRepository.save(employeeOfRelation);
		} else if (experienceIndex.getMessage().contains("delete")) {
			employeeOfRelationRepository.deleteById(employeeOfRelation.getRole());
		}

	}

	@KafkaListener(topics = "ProjectIndexer", groupId = "group_json", containerFactory = "projectKafkaListenerFactory")
	public void consumeJson(ProjectIndex projectIndex) {
		System.out.println("Consumed JSON Message: " + projectIndex);
		ProfileId profileId = new ProfileId(projectIndex.getProfileId());
		Skill skill = new Skill(projectIndex.getSkills().toLowerCase());
		Company company = new Company(projectIndex.getProjectAt().toLowerCase());
		Project project = new Project(projectIndex.getProjectId(), projectIndex.getProjectTitle(),
				projectIndex.getDepartment(), projectIndex.getProjectLocation());
		WorkedInRelation workedInRelation = new WorkedInRelation(projectIndex.getProjectId(), projectIndex.getRole(),
				projectIndex.getFrom(), projectIndex.getTo(), profileId, project);
		ProjectUsesSkillRelation projectUsesSkillRelation = new ProjectUsesSkillRelation(projectIndex.getProjectId(),
				projectIndex.getWeight(), project, skill);
		ProjectOfRelation projectOfRelation = new ProjectOfRelation(projectIndex.getProjectId(), project, company);
		if (projectIndex.getMessage().equals("save") || projectIndex.getMessage().contains("update")) {
			workedInRelationRepository.save(workedInRelation);
			usesSkillRelationRepository.save(projectUsesSkillRelation);
			projectOfRelationRepository.save(projectOfRelation);
		} else if (projectIndex.getMessage().contains("delete")) {
			workedInRelationRepository.deleteById(workedInRelation.getRole());
			usesSkillRelationRepository.deleteById(projectUsesSkillRelation.getProjectProfileId());
			projectOfRelationRepository.deleteById(projectOfRelation.getProjectProfileId());
		}

	}

	@KafkaListener(topics = "QualificationIndexer", groupId = "group_json", containerFactory = "qualificationKafkaListenerFactory")
	public void consumeJson(QualificationIndex qualificationIndex) {
		System.out.println("Consumed JSON Message: " + qualificationIndex);
		ProfileId profileId = new ProfileId(qualificationIndex.getProfileId());
		University university = new University(qualificationIndex.getInstituteName());
		StudiedAtRelation studiedAtRelation = new StudiedAtRelation(qualificationIndex.getQualification(),
				qualificationIndex.getYearOfJoining(), qualificationIndex.getYearOfCompletion(),
				qualificationIndex.getStream(), qualificationIndex.getMarks(), profileId, university);
		if (qualificationIndex.getMessage().equals("save") || qualificationIndex.getMessage().contains("update")) {
			studiedAtRelationRepository.save(studiedAtRelation);
		} else if (qualificationIndex.getMessage().contains("delete")) {
			studiedAtRelationRepository.deleteById(studiedAtRelation.getMarks());
		}

	}
*/
}
