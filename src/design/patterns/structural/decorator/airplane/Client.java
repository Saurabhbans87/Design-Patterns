/**
 * Create by saurabh
 * Date: 28/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.decorator.airplane;

public class Client {
    public static void main(String[] args) {
        Airpalne airpalne = new Economic();
        airpalne.airplaneType();
        System.out.println(airpalne.airplaneFare());
        System.out.println("***************Economic Class*******************");
        AirplaneDecorator airplaneDecorator = new AirplaneDecorator(airpalne);
        airplaneDecorator.airplaneType();
        System.out.print(airplaneDecorator.airplaneFare());
    }
}
