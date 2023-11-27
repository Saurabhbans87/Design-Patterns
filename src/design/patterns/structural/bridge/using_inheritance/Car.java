/**
 * Create by saurabh
 * Date: 27/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.bridge.using_inheritance;

public class Car implements Vehicle {

    @Override
    public void assemblyLineProduction() {
        System.out.println("Car assembly line production");
    }

    @Override
    public void assembled() {
        System.out.println("Car assembly line production done");
    }

    @Override
    public void testedDone() {
        System.out.println("Car Tested");
    }
}