package design.patterns.behavioral.chain.vending;

public interface Vending {
    public void processTransaction(int amount);
    public void processNextTransaction(Vending vending);
}
