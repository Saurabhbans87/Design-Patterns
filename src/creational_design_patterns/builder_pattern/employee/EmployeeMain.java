/**
 * Create by saurabh
 * Date: 15/11/23
 * Project Name: Design-Patterns
 */
package creational_design_patterns.builder_pattern.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee(new EmployeeBuilder("Priya","priya@test.com","Uday","FGDSFD3543"));
        System.out.println(employee1);

        Employee employee2 = new Employee(new EmployeeBuilder("Priyanka","priyanka@gmail.com","Anant","FGHDGFD34"));
        System.out.println(employee2);
    }
}
