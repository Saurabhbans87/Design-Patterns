/**
 * Create by saurabh
 * Date: 24/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.decorator.pizza;

public abstract class DecoratorVegPizza implements Pizza {
    protected Pizza pizza;

    public DecoratorVegPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double pizzaCost() {
        return pizza.pizzaCost();
    }

    @Override
    public String pizza() {
        return pizza.pizza();
    }
}
