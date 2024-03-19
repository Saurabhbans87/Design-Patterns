/**
 * Create by saurabh
 * Date: 19/03/24
 * Project Name: Design-Patterns
 */
package design.patterns.creational.builder.employee;

public class EmployeeBuilder {
    private String name;
    private int age;
    private String panNumber;
    private String aadharNumber;
    private String companyName;

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public EmployeeBuilder setPanNumber(String panNumber) {
        this.panNumber = panNumber;
        return this;
    }

    public EmployeeBuilder setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
        return this;
    }

    public EmployeeBuilder setCompanyName (String companyName) {
        companyName = companyName;
        return this;
    }
    public Employee build(){
        return new Employee(name,age,panNumber,aadharNumber,companyName);
    }
}
