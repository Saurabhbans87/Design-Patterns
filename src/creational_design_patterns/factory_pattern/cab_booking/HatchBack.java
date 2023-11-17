/**
 * Create by saurabh
 * Date: 17/11/23
 * Project Name: Design-Patterns
 */
package creational_design_patterns.factory_pattern.cab_booking;

public class HatchBack implements CabBooking{
    @Override
    public void cabBooked() {
        System.out.println("Hatchback is booked");
    }
}
