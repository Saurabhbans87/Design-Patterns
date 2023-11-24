/**
 * Create by saurabh
 * Date: 24/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.decorator.pizza;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new VegExtraTopping(new VegExtraCheese(new VegPizza()));
        System.out.println(pizza.pizzaCost());
        System.out.println(pizza.pizza());
    }
}
