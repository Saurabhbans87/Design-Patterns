/**
 * Create by saurabh
 * Date: 28/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.composite;

public class Sde implements Employee{
    private String employeeName;
    private String employeePosition;

    public Sde(String employeeName, String employeePosition) {
        this.employeeName = employeeName;
        this.employeePosition = employeePosition;
    }

    @Override
    public void employeeDetails() {
        System.out.println("Employee Name " +employeeName +" and position is " +employeePosition);
    }
}
