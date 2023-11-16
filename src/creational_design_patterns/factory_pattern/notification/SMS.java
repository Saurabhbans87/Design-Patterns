/**
 * Create by saurabh
 * Date: 16/11/23
 * Project Name: Design-Patterns
 */
package creational_design_patterns.factory_pattern.notification;

public class SMS implements Notification{
    @Override
    public void notificationSystem() {
        System.out.println("SMS has been sent");
    }
}
