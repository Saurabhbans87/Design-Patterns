package design.patterns.creational.abstract_factory;

public interface CabBookingSystem {
    public void book(int distance);
    public void setVehicleType();
    public void setBaseCost();
    public void setVehicleChargesPerUnitDistance();
    int calculateCostOfBooking(int distance);
}