/**
 * Create by saurabh
 * Date: 18/03/24
 * Project Name: Design-Patterns
 */
package design.patterns.creational.factory.without;

public class ByAir implements Transport{
    @Override
    public void deliverdOrder() {
        System.out.println("Delivered by Air");
    }
}
