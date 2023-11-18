/**
 * Create by saurabh
 * Date: 18/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.creational.singleton.eager_version;

public class Employee {
    public static Employee employee;

    private Employee() {
    }
    static {
        employee = new Employee();
    }
    void employeeDeatils(){
        System.out.println("Employee details fetch successfully");
    }
}
