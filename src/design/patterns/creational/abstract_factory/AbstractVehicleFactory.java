package design.patterns.creational.abstract_factory;

public abstract class AbstractVehicleFactory {
    public abstract CabBookingSystem getVehicle(String type);
}
