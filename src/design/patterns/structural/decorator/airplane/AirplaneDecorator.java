/**
 * Create by saurabh
 * Date: 28/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.decorator.airplane;

public class AirplaneDecorator implements Airpalne{
    Airpalne airpalne;
    public AirplaneDecorator(Airpalne airpalne) {
        this.airpalne = airpalne;
    }
    @Override
    public double airplaneFare() {
        double totalFare;
        double extraLegRoomCharge = 2000;
        double airplaneFare = airpalne.airplaneFare();
        totalFare = airplaneFare+extraLegRoomCharge;
        return totalFare;
    }
    @Override
    public void airplaneType() {
        airpalne.airplaneType();
        System.out.print(" with extra Leg ");
    }
}
