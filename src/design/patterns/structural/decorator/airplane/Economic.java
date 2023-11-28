/**
 * Create by saurabh
 * Date: 28/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.decorator.airplane;

public class Economic implements Airpalne{
    @Override
    public double airplaneFare() {
        return 10000;
    }

    @Override
    public void airplaneType() {
        System.out.println("Economic Class");
    }
}
