/**
 * Create by saurabh
 * Date: 23/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.decorator.salary;

public class IncentiveSalary extends SalaryDecorator{
    public IncentiveSalary(Salary salary) {
        super(salary);
    }

    @Override
    public double baseSalary() {
        return super.baseSalary()+50000;
    }
}
