/**
 * Create by saurabh
 * Date: 24/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.decorator.pizza;

public class NonVegPizza implements Pizza{
    @Override
    public double pizzaCost() {
        return 150;
    }

    @Override
    public String pizza() {
        return " ";
    }
}
