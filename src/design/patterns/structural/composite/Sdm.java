/**
 * Create by saurabh
 * Date: 28/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Sdm implements Employee{
    private String employeeName;
    private String employeePosition;
    private List<Employee> employeeList;

    public Sdm(String employeeName, String employeePosition) {
        this.employeeName = employeeName;
        this.employeePosition = employeePosition;
        this.employeeList = new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }

    @Override
    public void employeeDetails() {
        System.out.println("SDM Team is");
        System.out.println("Name is " +employeeName +" working as "+employeePosition);
        for (Employee employee : employeeList){
            employee.employeeDetails();
        }
    }
}
