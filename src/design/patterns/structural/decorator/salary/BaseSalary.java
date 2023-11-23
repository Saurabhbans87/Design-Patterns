/**
 * Create by saurabh
 * Date: 23/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.decorator.salary;

public class BaseSalary implements Salary {

    @Override
    public double baseSalary() {
        return 100000;
    }

    @Override
    public String getSalary() {
        return " ";
    }
}
