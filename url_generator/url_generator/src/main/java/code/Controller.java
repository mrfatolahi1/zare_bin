package code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Controller {

    @Autowired
    private Sender sender;

//    public Controller() {
//        Map<String, Object> kafkaConfigs = KafkaProducerConfig.getConfig();
//        KafkaTemplateCreator templateCreator = new KafkaTemplateCreator(kafkaConfigs);
//        this.sender = new Sender(templateCreator.createKafkaTemplate());
//    }

//    public void operate(){
//        while (true){
//            System.out.println("AAAAAAAAAAAAAAAAAAa");
//            sender.send("quickstart-events", URLGenerator.generateNewUrl());
//        }
//    }

    @EventListener
    void initiateSendingMessage(ApplicationReadyEvent event) throws InterruptedException {
        while (true){
            System.out.println("event = " + event);
            sender.send("topic1", "Salam!");
            Thread.sleep(100);
        }
    }
}
