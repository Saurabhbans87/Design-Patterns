/**
 * Create by saurabh
 * Date: 28/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.composite;

public class Client {
    public static void main(String[] args) {
        Employee employee1 = new Sde("Rahul","SDE");
        Employee employee2 = new Sde("Ashu","SDE");

        Sdm manager = new Sdm("Json","SDM");
        manager.addEmployee(employee1);
        manager.addEmployee(employee2);

        manager.employeeDetails();
    }
}
