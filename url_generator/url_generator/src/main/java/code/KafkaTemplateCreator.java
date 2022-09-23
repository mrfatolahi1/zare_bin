//package code;
//
//import org.springframework.kafka.core.DefaultKafkaProducerFactory;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.core.ProducerFactory;
//import org.springframework.stereotype.Component;
//
//import java.util.Map;
//
//@Component
//public final class KafkaTemplateCreator {
//    private Map<String, Object> kafkaConfigs;
//
//    public KafkaTemplateCreator(Map<String, Object> kafkaConfigs) {
//        this.kafkaConfigs = kafkaConfigs;
//    }
//
//    public Map<String, Object> getKafkaConfigs() {
//        return kafkaConfigs;
//    }
//
//    public void setKafkaConfigs(Map<String, Object> kafkaConfigs) {
//        this.kafkaConfigs = kafkaConfigs;
//    }
//
//    private ProducerFactory<String, String> createProducerFactory(Map<String, Object> kafkaConfigs) {
//        return new DefaultKafkaProducerFactory<>(kafkaConfigs);
//    }
//
//    public KafkaTemplate<String, String> createKafkaTemplate(){
//        ProducerFactory<String, String> producerFactory = createProducerFactory(this.kafkaConfigs);
//        return new KafkaTemplate<>(producerFactory);
//    }
//}
