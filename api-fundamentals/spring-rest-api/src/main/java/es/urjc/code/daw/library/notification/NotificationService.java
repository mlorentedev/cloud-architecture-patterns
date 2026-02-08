package es.urjc.code.daw.library.notification;

import org.springframework.stereotype.Service;
import org.togglz.core.manager.FeatureManager;

import es.urjc.code.daw.library.toggle.Features;

@Service
public class NotificationService {

    private final FeatureManager featureManager;
    private final NotificationByEventService notificationByEventService;
    private final NotificationByLogService notificationByLogService;

    public NotificationService(FeatureManager featureManager, NotificationByEventService notificationByEventService, NotificationByLogService notificationByLogService) {
        this.featureManager = featureManager;
        this.notificationByEventService = notificationByEventService;
        this.notificationByLogService = notificationByLogService;
    }

    public void notify(String message) {
        if (featureManager.isActive(Features.NOTIFICATIONS_BY_EVENT)) {
            notificationByEventService.notify(message);
        } else {
            notificationByLogService.notify(message);
        }
    }
    
}
