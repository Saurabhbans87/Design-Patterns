/**
 * Create by saurabh
 * Date: 17/11/23
 * Project Name: Design-Patterns
 */
package creational_design_patterns.factory_pattern.cab_booking;

public class CabBookingMain {
    public static void main(String[] args) {
        CabBookingFactory cabBookingFactory = new CabBookingFactory();
        cabBookingFactory.getCab("Hatchback").cabBooked();
    }
}
