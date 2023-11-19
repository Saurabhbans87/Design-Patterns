/**
 * Create by saurabh
 * Date: 19/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.proxy;

public class RetailBank implements Bank{
    double availableAmount;
    @Override
    public void deposit(double depositAmount) {
        availableAmount = availableAmount+depositAmount;
        System.out.println("Available Amount : " +availableAmount);
    }

    @Override
    public void withdraw(double withdrawAmount) {
        if(withdrawAmount>availableAmount){
            throw new IllegalArgumentException("insufficient Balance");
        }
        availableAmount = availableAmount-withdrawAmount;
        System.out.println("Amount withdraw : " +availableAmount);
    }

    @Override
    public double getBalance() {
        return availableAmount;
    }
}
