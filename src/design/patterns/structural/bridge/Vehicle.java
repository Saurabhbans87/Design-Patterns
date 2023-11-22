/**
 * Create by saurabh
 * Date: 22/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.bridge;

abstract class Vehicle {
    protected WorkShop workShop;

    public Vehicle(WorkShop workShop) {
        this.workShop = workShop;
    }
    public abstract void vehicleAssembled();
}
