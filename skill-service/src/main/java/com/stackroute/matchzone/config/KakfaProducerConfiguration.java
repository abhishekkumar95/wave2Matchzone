package com.stackroute.matchzone.config;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.stackroute.matchzone.indexermodel.Indexer;
import com.stackroute.matchzone.indexermodel.SkillIndex;
import com.stackroute.matchzone.model.Skills;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KakfaProducerConfiguration {

	
	@Bean
	public ProducerFactory<String, Indexer> producerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

		return new DefaultKafkaProducerFactory<>(config);
	}
	
	@Bean
	public ProducerFactory<String, SkillIndex> producerFactoryIndex() {
		Map<String, Object> config = new HashMap<>();

		config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

		return new DefaultKafkaProducerFactory<>(config);
	}

	@Bean
	public ProducerFactory<String, Skills> producerFactoryskill() {
		Map<String, Object> config = new HashMap<>();

		config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

		return new DefaultKafkaProducerFactory<>(config);
	}
	
	
	@Bean
	public KafkaTemplate<String, Indexer> kafkaTemplate() {
		return new KafkaTemplate<>(producerFactory());
	}
	
	@Bean
	public KafkaTemplate<String, Skills> kafkaTemplateskill() {
		return new KafkaTemplate<>(producerFactoryskill());
	}
	
	@Bean
	public KafkaTemplate<String, SkillIndex> kafkaTemplateIndex() {
		return new KafkaTemplate<>(producerFactoryIndex());
	}

}
