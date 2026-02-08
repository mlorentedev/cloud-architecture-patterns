package es.urjc.code.daw.library.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.urjc.code.daw.library.events.NotificationEvent;
import es.urjc.code.daw.library.events.NotificationEventService;

@Component
public class NotificationByEventService{
    
    @Autowired
    NotificationEventService eventService;

    public void notify(String message) {
        eventService.sendNotification(new NotificationEvent(this, message));
    }
}
