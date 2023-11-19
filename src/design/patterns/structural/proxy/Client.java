/**
 * Create by saurabh
 * Date: 19/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.proxy;

public class Client {
    public static void main(String[] args) {
        Bank bank = new RetailBankProxy();
        bank.deposit(1000000);
        bank.getBalance();
        bank.withdraw(100000);
    }
}
