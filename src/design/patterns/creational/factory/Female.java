/**
 * Create by saurabh
 * Date: 18/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.creational.factory;

public class Female implements Gender {
    @Override
    public void booked() {
        System.out.println("Booked for female");
    }
}
