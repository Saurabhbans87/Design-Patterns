/**
 * Create by saurabh
 * Date: 26/10/24
 * Project Name: Design-Patterns
 */
package design.patterns.structural.adapter.Payment;

public class Newpayment implements ClientPaymentProcessor{
    NewPaymentProcessor newPaymentProcessor;
    public void Newpayment(NewPaymentProcessor newPaymentProcessor){
        this.newPaymentProcessor = newPaymentProcessor;
    }
    public void paymentProcessor(){
        newPaymentProcessor.newPaymentProcessor();
    }
}
