/**
 * Create by saurabh
 * Date: 26/10/24
 * Project Name: Design-Patterns
 */
package design.patterns.structural.adapter.Payment;

public class PaymentSystem {
    public static void main(String[] args) {
        OldPaymentProcessor oldPaymentProcessor = new OldPaymentProcessor();
        ClientPaymentProcessor clientPaymentProcessor = new Oldpayment(oldPaymentProcessor);
        clientPaymentProcessor.paymentProcessor();
    }
}