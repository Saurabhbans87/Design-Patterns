/**
 * Create by saurabh
 * Date: 17/11/23
 * Project Name: Design-Patterns
 */
package creational_design_patterns.factory_pattern.cab_booking;

public class CabBookingFactory {
    public CabBooking getCab(String cab){
        if(cab == "Hatchback"){
            return new HatchBack();
        } else if (cab == "Sedan") {
            return new Sedan();
        } else {
            return new Auto();
        }
    }
}
