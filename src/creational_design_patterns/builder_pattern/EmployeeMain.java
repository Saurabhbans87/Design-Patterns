/**
 * Create by saurabh
 * Date: 15/11/23
 * Project Name: Design-Patterns
 */
package creational_design_patterns.builder_pattern;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee().setFirstName("Ravi").setFatherName("Rajdeep").setPanNumber("AFDGD345");
        System.out.print(employee);
    }
}
