package es.urjc.code.daw.library.events;

import org.springframework.context.ApplicationEvent;

public class NotificationEvent extends ApplicationEvent{

    private String message;
    
    public NotificationEvent(Object source, String message) {
        super(source);
        this.message = "NOTIFICATION BY EVENT - " + message;
    }

    public String getMessage() {
        return message;
    }
}
