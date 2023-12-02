package design.patterns.creational.abstract_factory;

public class CarBookingFactory extends AbstractVehicleFactory {
	
    @Override
    public CabBookingSystem getVehicle(String type) {
        if(type.equalsIgnoreCase("Micro")) {
            return new CarHatchback();
        }
        else if(type.equalsIgnoreCase("Mini")) {
            return new CarSedan();
        }
        else if(type.equalsIgnoreCase("Mega")) {
            return new CarSuv();
        }
        else{
            return new CarSedan();
        }
    }
}
