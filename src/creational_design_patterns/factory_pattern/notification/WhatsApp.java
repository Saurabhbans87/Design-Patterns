/**
 * Create by saurabh
 * Date: 16/11/23
 * Project Name: Design-Patterns
 */
package creational_design_patterns.factory_pattern.notification;

public class WhatsApp implements Notification{
    @Override
    public void notificationSystem() {
        System.out.println("Whats app message has been sent");
    }
}
