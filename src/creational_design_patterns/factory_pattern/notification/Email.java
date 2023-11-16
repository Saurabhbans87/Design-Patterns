/**
 * Create by saurabh
 * Date: 16/11/23
 * Project Name: Design-Patterns
 */
package creational_design_patterns.factory_pattern.notification;

public class Email implements Notification{
    @Override
    public void notificationSystem() {
        System.out.println("Email has been sent");
    }
}
