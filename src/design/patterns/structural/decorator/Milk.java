/**
 * Create by saurabh
 * Date: 23/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.decorator;

public class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getCoffee() {
        return coffee.getCoffee() + "Milk";
    }

    @Override
    public double coffeeCost() {
        return coffee.coffeeCost() + 50;
    }
}
