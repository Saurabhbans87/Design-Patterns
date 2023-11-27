/**
 * Create by saurabh
 * Date: 27/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.bridge.using_inheritance;

public class CarPetrol extends Car{
    Car car;
    public CarPetrol() {
        car = new Car();
    }
    public void engine(){
        System.out.println("Petrol Car");
    }
}
