package es.urjc.code.daw.library.events;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class NotificationEventService implements ApplicationEventPublisherAware {
    
    private ApplicationEventPublisher eventPublisher;
    
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }
    
    public void sendNotification(NotificationEvent event) {
        eventPublisher.publishEvent(event);
    }
}
