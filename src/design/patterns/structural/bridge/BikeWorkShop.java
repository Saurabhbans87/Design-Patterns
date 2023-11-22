/**
 * Create by saurabh
 * Date: 22/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.bridge;

public class BikeWorkShop implements WorkShop {
    @Override
    public void repair() {
        System.out.println("Bike repaired");
    }

    @Override
    public void painted() {
        System.out.println("Bike painted");
    }
}
