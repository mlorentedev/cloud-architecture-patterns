package es.urjc.code.daw.library.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationEventNotifier implements ApplicationListener<NotificationEvent> {
    
    public void onApplicationEvent(NotificationEvent event) {
        System.out.println(event.getMessage());
    }
}
