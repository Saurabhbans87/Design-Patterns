package design.patterns.behavioral.mediator;

public interface AirTrafficControlSystem {
    void send(String message,Flight flight);
    void addFlight(Flight flight);
}
