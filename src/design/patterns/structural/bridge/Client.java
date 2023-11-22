/**
 * Create by saurabh
 * Date: 22/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.bridge;

public class Client {
    public static void main(String[] args) {
        WorkShop workShop = new BikeWorkShop();
        Vehicle vehicle = new Bike(workShop);
        vehicle.vehicleAssembled();

        WorkShop workShop1 = new CarWorkShop();
        Vehicle vehicle1 = new Car(workShop1);
        vehicle1.vehicleAssembled();
    }
}
