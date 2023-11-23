/**
 * Create by saurabh
 * Date: 23/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.decorator.salary;

public class Client {
    public static void main(String[] args) {
        Salary salary = new IncentiveSalary(new BaseSalary());
        System.out.println(salary.getSalary());
        System.out.println(salary.baseSalary());
    }
}

