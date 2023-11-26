/**
 * Create by saurabh
 * Date: 26/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.behavioral.chain.vending;

public class Clien {
    public static void main(String[] args) {
        Vending vending = new TenRs();
        vending.processPrroduct(20);

    }
}
