/**
 * Create by saurabh
 * Date: 01/12/23
 * Project Name: Design-Patterns
 */
package design.patterns.behavioral.mediator;

public abstract class Flight {
    protected AirTrafficControlSystem airTrafficControlSystem;
    protected String flightNumber;

    public Flight(AirTrafficControlSystem airTrafficControlSystem, String flightNumber) {
        this.airTrafficControlSystem = airTrafficControlSystem;
        this.flightNumber = flightNumber;
    }
    abstract void sendMessage(String message);
    abstract void receiveMessage(String message);
}
