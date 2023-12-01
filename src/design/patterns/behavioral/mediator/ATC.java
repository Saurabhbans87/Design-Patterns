/**
 * Create by saurabh
 * Date: 01/12/23
 * Project Name: Design-Patterns
 */
package design.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ATC implements AirTrafficControlSystem{
    private List<Flight> flightList;

    public ATC() {
        this.flightList = new ArrayList<>();
    }

    @Override
    public void send(String message, Flight flight) {
        for (Flight flight1:flightList) {
            if(flight1 != flight){
                flight.receiveMessage(message);
            }
        }
    }

    @Override
    public void addFlight(Flight flight) {
        flightList.add(flight);
    }
}
