package design.patterns.creational.abstract_factory;

public class AutoBookingFactory extends AbstractVehicleFactory {

    @Override
    public CabBookingSystem getVehicle(String type){
        if(type.equalsIgnoreCase("Personal")) {
            return new AutoPersonal();
        }
        else if(type.equalsIgnoreCase("Shared")) {
            return new AutoShared();
        }
        else{
            return new AutoPersonal();
        }
    }
}
