/**
 * Create by saurabh
 * Date: 25/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.behavioral.strategy.calculator;

public class OperationStrategy {
    Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public void execute(int a, int b){
        calculator.execute(a,b);
    }
}
