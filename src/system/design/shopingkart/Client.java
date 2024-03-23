/**
 * Create by saurabh
 * Date: 22/03/24
 * Project Name: Design-Patterns
 */
package system.design.shopingkart;

public class Client {
    public static void main(String[] args) {
        Product product1 = new Product("Shirt",1500);
        Product product2 = new Product("Paint", 2000);
        ShopingKart shopingKart = new ShopingKart();
        shopingKart.addProduct(product1);
        shopingKart.addProduct(product2);
        double totalPrice = shopingKart.getTotalPrice();
        System.out.println("Total Price");
        System.out.println(totalPrice);
    }
}
