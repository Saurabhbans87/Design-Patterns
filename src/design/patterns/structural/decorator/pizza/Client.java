/**
 * Create by saurabh
 * Date: 24/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.decorator.pizza;

public class Client {
    public static void main(String[] args) {
        System.out.println("**************************Veg Pizza*****************************");
        Pizza vegPizza = new VegPizza();
        System.out.println(vegPizza.pizza());
        System.out.println(vegPizza.pizzaCost());
        System.out.println("**************************Veg Pizza with Extra*****************************");
        Pizza vegPizzaWithExtra = new VegExtraCheese(new VegExtraTopping(new VegPizza()));
        System.out.println(vegPizzaWithExtra.pizza());
        System.out.println(vegPizzaWithExtra.pizzaCost());
        System.out.println("**************************Non Veg Pizza*****************************");
        Pizza nonVegPizza = new NonVegPizza();
        System.out.println(nonVegPizza.pizza());
        System.out.println(nonVegPizza.pizzaCost());
        System.out.println("**************************Non Veg Pizza with Extra*****************************");
        Pizza nonVegPizzaWithExtra = new NonVegExtraCheese(new NonVegExtraTopping(new NonVegPizza()));
        System.out.println(nonVegPizzaWithExtra.pizza());
        System.out.println(nonVegPizzaWithExtra.pizzaCost());
    }
}
