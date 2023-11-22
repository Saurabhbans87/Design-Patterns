/**
 * Create by saurabh
 * Date: 22/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.bridge;

public class CarWorkShop implements WorkShop {
    @Override
    public void repair() {
        System.out.println("Car is repaired");
    }

    @Override
    public void painted() {
        System.out.println("Car is painted");
    }
}
