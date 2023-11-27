/**
 * Create by saurabh
 * Date: 27/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.bridge.using_bridge;

public class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Petrol Engine");
    }
}
