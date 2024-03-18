/**
 * Create by saurabh
 * Date: 18/03/24
 * Project Name: Design-Patterns
 */
package design.patterns.creational.factory.without.with;

public class ByRoad implements Transport{
    @Override
    public void delivered() {
        System.out.println("By road");
    }
}
