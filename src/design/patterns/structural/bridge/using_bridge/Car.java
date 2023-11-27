/**
 * Create by saurabh
 * Date: 27/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.bridge.using_bridge;

public class Car extends Vehicle{

    public Car(Engine engine) {
        super(engine);
    }

    @Override
    public void start() {
        System.out.println("Car");
        engine.start();
    }
}
