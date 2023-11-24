package design.patterns.structural.facade.order;

public interface OrderManagement {
   public void getOrder();
   public void processOrder();
   public void processPayment();
   public void deliverOrder();
}