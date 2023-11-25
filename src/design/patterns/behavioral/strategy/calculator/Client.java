/**
 * Create by saurabh
 * Date: 25/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.behavioral.strategy.calculator;

public class Client {
    public static void main(String[] args) {
        OperationStrategy operationStrategy = new OperationStrategy();
        operationStrategy.setCalculator(new Addition());
        operationStrategy.execute(10,20);
    }
}
