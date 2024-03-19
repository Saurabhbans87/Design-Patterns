/**
 * Create by saurabh
 * Date: 18/03/24
 * Project Name: Design-Patterns
 */
package design.patterns.creational.factory.without.with;

public class Client {
    public static void main(String[] args) {
        Fcatory fcatory = new Fcatory();
        fcatory.build(TransportType.BYROAD).delivered();
    }
}
