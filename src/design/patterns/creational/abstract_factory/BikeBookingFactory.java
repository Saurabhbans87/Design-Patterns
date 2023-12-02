package design.patterns.creational.abstract_factory;

public class BikeBookingFactory extends AbstractVehicleFactory {

    @Override
    public CabBookingSystem getVehicle(String type){
        if(type.equalsIgnoreCase("Normal")) {
            return new BikeNormal();
        }
        else if(type.equalsIgnoreCase("Sports")) {
            return new BikeSports();
        }
        else{
            return new BikeNormal();
        }
    }
}
