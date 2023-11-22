/**
 * Create by saurabh
 * Date: 22/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.adapter.Kilometerstomiles;

public class KilometersToMiles implements Miles{
    private Kilometers kilometers;

    public KilometersToMiles(Kilometers kilometers) {
        this.kilometers = kilometers;
    }
    //1 Mile = 1.609344 Kilometers
    @Override
    public double perMilesCharge(double km) {
        double miles = 1.609344 * km;
        double perMilesCharge = kilometers.perKilometersCharge(miles);
        return perMilesCharge;
    }
}
