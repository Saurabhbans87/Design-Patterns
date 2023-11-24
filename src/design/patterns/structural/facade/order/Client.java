/**
 * Create by saurabh
 * Date: 24/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.facade.order;

public class Client {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.vegOrder();
        orderFacade.nonVegOrder();
    }
}
