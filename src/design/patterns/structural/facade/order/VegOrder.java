/**
 * Create by saurabh
 * Date: 24/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.facade.order;

public class VegOrder implements OrderManagement{
    @Override
    public void getOrder() {
       System.out.println("Received veg order");
    }
    @Override
    public void processOrder() {
        System.out.println("Order has been process");
    }
    @Override
    public void processPayment() {
        System.out.println("Received payment");
    }
    @Override
    public void deliverOrder() {
        System.out.println("delivered veg order to customer");
    }
}
