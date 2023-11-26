/**
 * Create by saurabh
 * Date: 25/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.behavioral.chain.vending;

public class TenRs implements Vending{
    private Vending vending;

    public void setVending(Vending vending) {
        this.vending = vending;
    }

    @Override
    public void processPrroduct(int amount) {
        if(amount==10){
            System.out.println("10 Rupees Item");
        }else {
                vending.processPrroduct(amount);
        }
    }

    @Override
    public void nextNext(Vending vending) {
        this.vending= vending;
    }
}
