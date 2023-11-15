/**
 * Create by saurabh
 * Date: 15/11/23
 * Project Name: Design-Patterns
 */
package creational_design_patterns.builder_pattern.user;

public class UserMain {
    public static void main(String[] args) {
        User user = new User(new UserBuilder());
        user.firstName="Amit";
        System.out.println(user);

        User user1 = new User(new UserBuilder());
        user1.firstName="Ram";
        user1.panNumber="HDFG35RY";
        System.out.println(user1);
    }
}
