/**
 * Create by saurabh
 * Date: 15/11/23
 * Project Name: Design-Patterns
 */
package creational_design_patterns.builder_pattern.user;

public class UserBuilder {
    String firstName;
    String middleName;
    String lastName;
    String panNumber;

    public UserBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return new UserBuilder();
    }

    public UserBuilder setMiddleName(String middleName) {
        this.middleName = middleName;
        return new UserBuilder();
    }

    public UserBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return new UserBuilder();
    }

    public UserBuilder setPanNumber(String panNumber) {
        this.panNumber = panNumber;
        return new UserBuilder();
    }
    public User build(){
        return new User(this);
    }

    public UserBuilder() {
    }

    @Override
    public String toString() {
        return "UserBuilder{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", panNumber='" + panNumber + '\'' +
                '}';
    }
}
