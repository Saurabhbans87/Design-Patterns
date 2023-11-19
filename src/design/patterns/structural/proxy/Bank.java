package design.patterns.structural.proxy;

public interface Bank {
    public void deposit(double depositAmount);
    public void withdraw(double withdrawAmount);
    public double getBalance();
}
