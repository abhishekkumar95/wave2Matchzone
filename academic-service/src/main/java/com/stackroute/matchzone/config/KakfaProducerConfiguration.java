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
import com.stackroute.matchzone.indexermodel.AcademicIndex;
import com.stackroute.matchzone.model.Academic;

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
	public ProducerFactory<String, AcademicIndex> producerFactoryIndex() {
		Map<String, Object> config = new HashMap<>();

		config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

		return new DefaultKafkaProducerFactory<>(config);
	}

	@Bean
	public ProducerFactory<String, Academic> producerFactoryacademic() {
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
	public KafkaTemplate<String, Academic> kafkaTemplateskill() {
		return new KafkaTemplate<>(producerFactoryacademic());
	}
	
	@Bean
	public KafkaTemplate<String, AcademicIndex> kafkaTemplateIndex() {
		return new KafkaTemplate<>(producerFactoryIndex());
	}

}
