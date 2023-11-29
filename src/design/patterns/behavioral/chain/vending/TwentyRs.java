/**
 * Create by saurabh
 * Date: 25/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.behavioral.chain.vending;

public class TwentyRs implements Vending{
    private Vending vending;

    @Override
    public void processTransaction(int amount) {
        if(amount==20){
            System.out.println("10 Rupees Item");
        }else {
            vending.processTransaction(amount);
        }
    }

    @Override
    public void processNextTransaction(Vending vending) {
        this.vending = vending;
    }
}
