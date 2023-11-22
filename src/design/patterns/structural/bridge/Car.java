/**
 * Create by saurabh
 * Date: 22/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.bridge;

public class Car extends Vehicle {
    public Car(WorkShop workShop) {
        super(workShop);
    }
    @Override
    public void vehicleAssembled() {
        workShop.painted();
        workShop.repair();
        System.out.println("Car is assembled");
    }
}
