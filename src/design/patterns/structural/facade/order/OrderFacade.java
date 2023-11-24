/**
 * Create by saurabh
 * Date: 24/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.facade.order;

public class OrderFacade {
    private VegOrder vegOrder;
    private NonVegOrder nonVegOrder;

    public OrderFacade() {
        this.vegOrder = new VegOrder();
        this.nonVegOrder = new NonVegOrder();
    }
    public void vegOrder(){
        vegOrder.getOrder();
        vegOrder.processOrder();
        vegOrder.processPayment();
        vegOrder.deliverOrder();
    }

    public void nonVegOrder(){
        nonVegOrder.getOrder();
        nonVegOrder.processOrder();
        nonVegOrder.processPayment();
        nonVegOrder.deliverOrder();
    }
}
