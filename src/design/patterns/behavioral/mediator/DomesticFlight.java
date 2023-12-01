/**
 * Create by saurabh
 * Date: 01/12/23
 * Project Name: Design-Patterns
 */
package design.patterns.behavioral.mediator;

public class DomesticFlight extends Flight{

    public DomesticFlight(AirTrafficControlSystem airTrafficControlSystem, String flightNumber) {
        super(airTrafficControlSystem, flightNumber);
    }

    @Override
    void sendMessage(String message) {
        System.out.println("Domestic Flight " +flightNumber + " " +message);
        airTrafficControlSystem.send(message,this);

    }

    @Override
    void receiveMessage(String message) {
        System.out.println("Domestic Flight " +flightNumber + " " +message);
    }
}
