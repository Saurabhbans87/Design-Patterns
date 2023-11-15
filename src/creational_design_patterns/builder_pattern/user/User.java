/**
 * Create by saurabh
 * Date: 15/11/23
 * Project Name: Design-Patterns
 */
package creational_design_patterns.builder_pattern.user;

public class User {
    String firstName;
    String middleName;
    String lastName;
    String panNumber;

    public User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.middleName = userBuilder.middleName;
        this.lastName = userBuilder.lastName;
        this.panNumber = userBuilder.panNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", panNumber='" + panNumber + '\'' +
                '}';
    }
}
