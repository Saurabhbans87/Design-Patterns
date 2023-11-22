/**
 * Create by saurabh
 * Date: 22/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.adapter.Kilometerstomiles;

public class Kilometers {

    public double perKilometersCharge(double kilometers){
        double kilometersCharge = kilometers*10;
        return kilometersCharge;
    }
}
