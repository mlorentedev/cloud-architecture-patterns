package es.urjc.code.daw.library.notification;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import es.urjc.code.daw.library.events.NotificationEventService;

@Component
public class NotificationByLogService {
    Logger logger = LoggerFactory.getLogger(NotificationEventService.class);

    public void notify(String message) {
        logger.info(message);
    }
}
