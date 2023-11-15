/**
 * Create by saurabh
 * Date: 15/11/23
 * Project Name: Design-Patterns
 */
package creational_design_patterns.builder_pattern;

public class EmployeeBuilder {
    String firstName;
    String middleName;
    String lastName;
    String emailID;
    String fatherName;
    String panNumber;

    public EmployeeBuilder(String firstName, String emailID, String fatherName, String panNumber) {
        this.firstName = firstName;
        this.emailID = emailID;
        this.fatherName = fatherName;
        this.panNumber = panNumber;
    }

    public EmployeeBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public EmployeeBuilder setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public EmployeeBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder setEmailID(String emailID) {
        this.emailID = emailID;
        return this;
    }

    public EmployeeBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public EmployeeBuilder setPanNumber(String panNumber) {
        this.panNumber = panNumber;
        return this;
    }

    public Employee build(){
        return new Employee(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailID='" + emailID + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", panNumber='" + panNumber + '\'' +
                '}';
    }
}
