/**
 * Create by saurabh
 * Date: 27/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.bridge.using_inheritance;

public class Client {
    public static void main(String[] args) {
        CarPetrol carPetrol = new CarPetrol();
        carPetrol.assembled();
        carPetrol.assemblyLineProduction();
        carPetrol.engine();
        carPetrol.testedDone();
    }
}
