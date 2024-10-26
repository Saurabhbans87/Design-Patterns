/**
 * Create by saurabh
 * Date: 26/10/24
 * Project Name: Design-Patterns
 */
package design.patterns.structural.adapter.Payment;

public class Oldpayment implements ClientPaymentProcessor{
    private OldPaymentProcessor oldPaymentProcessor;
    public Oldpayment(OldPaymentProcessor oldPaymentProcessor){
        this.oldPaymentProcessor = oldPaymentProcessor;
    }
    @Override
    public void paymentProcessor() {
        oldPaymentProcessor.pldPaymentProcesssor();
    }
}
