/**
 * Create by saurabh
 * Date: 22/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.adapter.Kilometerstomiles;

public class Client {
    public static void main(String[] args) {
        Kilometers kilometers = new Kilometers();
        double perKilometersCharge = kilometers.perKilometersCharge(10);
        System.out.println("Kilometers Charge :" + perKilometersCharge);
        Miles miles = new KilometersToMiles(kilometers);
        double milesCharge = miles.perMilesCharge(10);
        System.out.println("Miles Charge :"+milesCharge);
    }
}
