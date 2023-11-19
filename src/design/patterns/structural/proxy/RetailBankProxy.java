/**
 * Create by saurabh
 * Date: 19/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.proxy;

public class RetailBankProxy implements Bank{
    private RetailBank retailBank;
    public RetailBank getRetailBank(){
        if(retailBank==null){
            retailBank = new RetailBank();
        }
        return retailBank;
    }
    @Override
    public void deposit(double depositAmount) {
        getRetailBank().deposit(depositAmount);
    }

    @Override
    public void withdraw(double withdrawAmount) {
        getRetailBank().withdraw(withdrawAmount);
    }

    @Override
    public double getBalance() {
        return retailBank.getBalance();
    }
}
