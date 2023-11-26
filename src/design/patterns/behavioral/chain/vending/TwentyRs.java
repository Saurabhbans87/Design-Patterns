/**
 * Create by saurabh
 * Date: 25/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.behavioral.chain.vending;

public class TwentyRs implements Vending{
    private Vending vending;
    @Override
    public void processPrroduct(int amount) {
        if(amount==20){
            System.out.println("Rupees 50 item got");
        }else {
            vending.processPrroduct(amount);
        }
    }

    @Override
    public void nextNext(Vending vending) {

    }
}
