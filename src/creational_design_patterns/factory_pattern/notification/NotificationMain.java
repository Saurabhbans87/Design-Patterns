/**
 * Create by saurabh
 * Date: 16/11/23
 * Project Name: Design-Patterns
 */
package creational_design_patterns.factory_pattern.notification;

public class NotificationMain {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notificationSystem();
    }
}
