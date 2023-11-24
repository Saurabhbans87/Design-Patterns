/**
 * Create by saurabh
 * Date: 24/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.facade.order;

public class NonVegOrder implements OrderManagement{
    @Override
    public void getOrder() {
        System.out.println("Received non veg order");
    }

    @Override
    public void processOrder() {
        System.out.println("Process non veg order");
    }

    @Override
    public void processPayment() {
        System.out.println("Received veg order payment");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Delivered non veg order to customer");
    }
}
