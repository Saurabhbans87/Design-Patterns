/**
 * Create by saurabh
 * Date: 27/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.bridge.using_bridge;



public class Client {
    public static void main(String[] args) {
        Engine evEngine = new EvEngine();
        Vehicle vehicle = new Car(evEngine);
        vehicle.start();
    }
}
