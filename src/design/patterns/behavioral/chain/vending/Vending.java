package design.patterns.behavioral.chain.vending;

public interface Vending {
    public void processPrroduct(int amount);
    public void nextNext(Vending vending);
}
