/**
 * Create by saurabh
 * Date: 16/11/23
 * Project Name: Design-Patterns
 */
package creational_design_patterns.factory_pattern.notification;

public class NotificationFactory {
    public Notification createNotification(String system){
        if(system=="SMS"){
            return new SMS();
        } else if (system=="EMAIL") {
            return new Email();

        } else if (system=="WHATSAPP") {
            return new WhatsApp();
        }else{
            throw new IllegalArgumentException("Source not defined" +system);
        }
    }
}
