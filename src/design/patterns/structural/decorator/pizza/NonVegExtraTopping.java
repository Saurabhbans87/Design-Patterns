/**
 * Create by saurabh
 * Date: 24/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.decorator.pizza;

public class NonVegExtraTopping extends DecoratorNonVegPizza{
    public NonVegExtraTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double pizzaCost() {
        return pizza.pizzaCost() + 50;
    }

    @Override
    public String pizza() {
        return "with topping "+pizza.pizza();
    }
}
