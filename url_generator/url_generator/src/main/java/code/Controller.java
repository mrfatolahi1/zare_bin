package code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Controller {

    @Autowired
    private Sender sender;

    @EventListener
    void initiateSendingMessage(ApplicationReadyEvent event) throws InterruptedException {
        while (true){
            System.out.println("event = " + event);
            sender.send("topic1", "Salam!");
            Thread.sleep(100);
        }
    }
}
