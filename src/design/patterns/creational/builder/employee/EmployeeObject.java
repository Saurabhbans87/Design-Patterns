/**
 * Create by saurabh
 * Date: 19/03/24
 * Project Name: Design-Patterns
 */
package design.patterns.creational.builder.employee;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employeeBuilder = new EmployeeBuilder()
                .setAadharNumber("13414134114")
                .build();
        System.out.println(employeeBuilder);
    }
}
