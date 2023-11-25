/**
 * Create by saurabh
 * Date: 25/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.behavioral.strategy.calculator;

public class Substraction implements Calculator{
    @Override
    public void execute(int a, int b) {
        System.out.println("Substraction is " +(a-b));
    }
}
