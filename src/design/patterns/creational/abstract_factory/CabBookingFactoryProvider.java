package design.patterns.creational.abstract_factory;

public class CabBookingFactoryProvider {
    public static AbstractVehicleFactory getVehicleFactory(String factoryType){   
        if(factoryType.equalsIgnoreCase("Car")) {
            return new CarBookingFactory();
        } else if(factoryType.equalsIgnoreCase("Auto")) {
            return new AutoBookingFactory();
        }
        else if(factoryType.equalsIgnoreCase("Bike")) {
            return new BikeBookingFactory();
        } else {
            return new CarBookingFactory();
        }
    }
}
