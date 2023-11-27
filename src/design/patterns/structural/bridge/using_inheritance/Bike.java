/**
 * Create by saurabh
 * Date: 27/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.bridge.using_inheritance;

public class Bike implements Vehicle {
    @Override
    public void assemblyLineProduction() {
        System.out.println("Bike assembly line production");
    }

    @Override
    public void assembled() {
        System.out.println("Bike assembled");
    }

    @Override
    public void testedDone() {
        System.out.println("Bike tested");
    }
}
