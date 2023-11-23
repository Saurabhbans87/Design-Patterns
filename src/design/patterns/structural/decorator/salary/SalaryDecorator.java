/**
 * Create by saurabh
 * Date: 23/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.decorator.salary;

public abstract class SalaryDecorator implements Salary {
    protected Salary salary;

    public SalaryDecorator(Salary salary) {
        this.salary = salary;
    }

    @Override
    public double baseSalary() {
        return salary.baseSalary();
    }
}
