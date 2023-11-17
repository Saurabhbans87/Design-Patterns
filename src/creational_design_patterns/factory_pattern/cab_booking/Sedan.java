/**
 * Create by saurabh
 * Date: 17/11/23
 * Project Name: Design-Patterns
 */
package creational_design_patterns.factory_pattern.cab_booking;

public class Sedan implements CabBooking{
    @Override
    public void cabBooked() {
        System.out.println("Sedan is booked");
    }
}
