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

   public Employee(EmployeeBuilder employeeBuilder){
       this.firstName = employeeBuilder.firstName;
       this.middleName = employeeBuilder.middleName;
       this.lastName = employeeBuilder.lastName;
       this.emailID = employeeBuilder.emailID;
       this.fatherName = employeeBuilder.fatherName;
       this.panNumber = employeeBuilder.panNumber;
   }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailID() {
        return emailID;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getPanNumber() {
        return panNumber;
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
