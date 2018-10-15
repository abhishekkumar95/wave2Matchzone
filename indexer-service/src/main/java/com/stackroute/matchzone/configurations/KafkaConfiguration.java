package com.stackroute.matchzone.configurations;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.stackroute.matchzone.indexermodel.LocationIndex;
import com.stackroute.matchzone.indexermodel.ProjectIndex;
import com.stackroute.matchzone.indexermodel.SkillIndex;
import com.stackroute.matchzone.indexermodel.AcademicIndex;
import com.stackroute.matchzone.indexermodel.CertificationIndex;



@EnableKafka
@Configuration
public class KafkaConfiguration {
	
	@Bean
	public ConsumerFactory<String, String> consumerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);

		return new DefaultKafkaConsumerFactory<>(config);
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<String, String>();
		factory.setConsumerFactory(consumerFactory());
		return factory;
	}

	@Bean
	public ConsumerFactory<String, LocationIndex> locationConsumerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
				new JsonDeserializer<>(LocationIndex.class));
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, LocationIndex> locationKafkaListenerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, LocationIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(locationConsumerFactory());
		return factory;
	}

	@Bean
	public ConsumerFactory<String, CertificationIndex> certificationConsumerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
				new JsonDeserializer<>(CertificationIndex.class));
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String,CertificationIndex> certificationKafkaListenerFactory() {
		ConcurrentKafkaListenerContainerFactory<String,CertificationIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(certificationConsumerFactory());
		return factory;
	}

	@Bean
	public ConsumerFactory<String, AcademicIndex> academicConsumerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
				new JsonDeserializer<>(AcademicIndex.class));
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String,AcademicIndex> academicKafkaListenerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, AcademicIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(academicConsumerFactory());
		return factory;
	}

	/*	@Bean
	public ConsumerFactory<String, QualificationIndex> qualificationConsumerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
				new JsonDeserializer<>(QualificationIndex.class));
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, QualificationIndex> qualificationKafkaListenerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, QualificationIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(qualificationConsumerFactory());
		return factory;
	}*/

	@Bean
	public ConsumerFactory<String, ProjectIndex> projectConsumerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
				new JsonDeserializer<>(ProjectIndex.class));
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, ProjectIndex> projectKafkaListenerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, ProjectIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(projectConsumerFactory());
		return factory;
	}

	@Bean
	public ConsumerFactory<String, SkillIndex> skillConsumerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
				new JsonDeserializer<>(SkillIndex.class));
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, SkillIndex> skillKafkaListenerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, SkillIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(skillConsumerFactory());
		return factory;
	}

}
