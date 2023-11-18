/**
 * Create by saurabh
 * Date: 18/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.creational.factory;

public class Male implements Gender {
    @Override
    public void booked() {
        System.out.println("Booked for male");
    }
}
