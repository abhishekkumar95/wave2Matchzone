package com.stackroute.matchzone.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.stackroute.matchzone.model.Academic;
import com.stackroute.matchzone.model.Certification;
import com.stackroute.matchzone.model.Location;
import com.stackroute.matchzone.model.PersonalInfo;
import com.stackroute.matchzone.model.Project;
import com.stackroute.matchzone.model.Skills;


@Configuration
public class KafkaProducerConfig {

	@Bean
    public Map<String, Object> producerConfigs() {
        Map<String, Object> props = new HashMap<>();
        
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"127.0.0.1:9092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return props;
    }

   /* @Bean
    public ProducerFactory<String, Experience> producerFactory1() {
        return new DefaultKafkaProducerFactory<String, Experience>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, Experience> kafkaTemplate1() {
        return new KafkaTemplate<>(producerFactory1());
    }
*/

    @Bean
    public ProducerFactory<String, Skills> producerFactory2() {
        return new DefaultKafkaProducerFactory<String, Skills>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, Skills> kafkaTemplate2() {
        return new KafkaTemplate<>(producerFactory2());
    }
    
    @Bean
    public ProducerFactory<String, PersonalInfo> producerFactory3() {
        return new DefaultKafkaProducerFactory<String, PersonalInfo>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, PersonalInfo> kafkaTemplate3() {
        return new KafkaTemplate<>(producerFactory3());
    }
    
   @Bean
    public ProducerFactory<String, Location> producerFactory4() {
        return new DefaultKafkaProducerFactory<String, Location>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, Location> kafkaTemplate4() {
        return new KafkaTemplate<>(producerFactory4());
    }
    
    
    @Bean
    public ProducerFactory<String, Project> producerFactory5() {
        return new DefaultKafkaProducerFactory<String,Project>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, Project> kafkaTemplate5() {
        return new KafkaTemplate<>(producerFactory5());
    }
    
     @Bean
    public ProducerFactory<String, Academic> producerFactory6() {
        return new DefaultKafkaProducerFactory<String, Academic>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, Academic> kafkaTemplate6() {
        return new KafkaTemplate<>(producerFactory6());
    }
    
    @Bean
    public ProducerFactory<String, Certification> producerFactory7() {
        return new DefaultKafkaProducerFactory<String, Certification>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, Certification> kafkaTemplate7() {
        return new KafkaTemplate<>(producerFactory7());
    }
}



