/**
 * Create by saurabh
 * Date: 01/12/23
 * Project Name: Design-Patterns
 */
package design.patterns.behavioral.mediator;

public class ATCSystem {
    public static void main(String[] args) {
        AirTrafficControlSystem airTrafficControlSystem = new ATC();
        Flight flight1 = new DomesticFlight(airTrafficControlSystem,"ABCD01");
        Flight flight2 = new DomesticFlight(airTrafficControlSystem,"ABCD02");

        airTrafficControlSystem.addFlight(flight1);
        airTrafficControlSystem.addFlight(flight2);

        flight1.sendMessage("Flight ABCD01 request for permission");
        airTrafficControlSystem.send("Landing permission confirmed ",flight1);
    }
}
