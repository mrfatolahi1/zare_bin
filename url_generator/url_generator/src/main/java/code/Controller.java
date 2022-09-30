package code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Controller {

    @Autowired
    private Sender sender;

    @Autowired
    private Reader reader;

    @EventListener
    void initiateSendingMessage(ApplicationReadyEvent event) throws InterruptedException {
      A:while (true){
            for (int i = 0; i < 100; i++) {
                String readedUrl = this.reader.readNewUrl();
                if (readedUrl == null){
                    break A;
                }
                sender.send("topic1", readedUrl);
            }
            Thread.sleep(1000);
        }
    }
}
