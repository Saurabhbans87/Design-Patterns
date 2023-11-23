/**
 * Create by saurabh
 * Date: 23/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = new Milk(new Cappuccino());
        System.out.println(coffee.getCoffee());
        System.out.println(coffee.coffeeCost());
    }
}
