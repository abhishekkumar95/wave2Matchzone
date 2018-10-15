package com.stackroute.matchzone.config;

import java.util.HashMap;
import java.util.Map;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.stackroute.matchzone.indexermodel.Indexer;
import com.stackroute.matchzone.indexermodel.LocationIndex;
import com.stackroute.matchzone.model.Location;

@Configuration
public class KafkaProducerConfiguration {

	@Bean
	public ProducerFactory<String, Indexer> producerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

		return new DefaultKafkaProducerFactory<>(config);
	}

	@Bean
	public ProducerFactory<String, LocationIndex> producerFactoryIndex() {
		Map<String, Object> config = new HashMap<>();
		config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		return new DefaultKafkaProducerFactory<>(config);
	}

	@Bean
	public ProducerFactory<String, Location> producerFactorylocation() {
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
	public KafkaTemplate<String, Location> kafkaTemplateskill() {
		return new KafkaTemplate<>(producerFactorylocation());
	}

	@Bean
	public KafkaTemplate<String, LocationIndex> kafkaTemplateIndex() {
		return new KafkaTemplate<>(producerFactoryIndex());
	}
}
