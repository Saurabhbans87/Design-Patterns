/**
 * Create by saurabh
 * Date: 25/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.behavioral.chain.vending;

public class FiftyRs implements Vending{
    private Vending vending;

    public void setVending(Vending vending) {
        this.vending = vending;
    }
    @Override
    public void processTransaction(int amount) {
            System.out.println("50 Rupees Item");
    }
    @Override
    public void processNextTransaction(Vending vending) {
            this.vending = vending;
    }
}
