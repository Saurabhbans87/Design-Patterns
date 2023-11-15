/**
 * Create by saurabh
 * Date: 15/11/23
 * Project Name: Design-Patterns
 */
package creational_design_patterns.builder_pattern;

public class Employee {
    String firstName;
    String middleName;
    String lastName;
    String emailID;
    String fatherName;
    String panNumber;

    public Employee setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Employee setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public Employee setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Employee setEmailID(String emailID) {
        this.emailID = emailID;
        return this;
    }

    public Employee setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public Employee setPanNumber(String panNumber) {
        this.panNumber = panNumber;
        return this;
    }

    public Employee getEmployee(){
        return new Employee();
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
