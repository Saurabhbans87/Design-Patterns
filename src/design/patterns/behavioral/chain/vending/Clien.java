/**
 * Create by saurabh
 * Date: 26/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.behavioral.chain.vending;

public class Clien {
    public static void main(String[] args) {
        Vending tenRs = new TenRs();
        Vending twentyRs = new TwentyRs();
        Vending fiftyRs = new FiftyRs();

        tenRs.processNextTransaction(twentyRs);
        twentyRs.processNextTransaction(fiftyRs);

        tenRs.processTransaction(10);
        tenRs.processTransaction(50);
        tenRs.processTransaction(20);
    }
}
