package design.patterns.creational.abstract_factory;

public class AbstractFactoryPatternDemoClient {
    public static void main(String[] args) {
        int distance = 10;

        /*
        * Book a Mini Car for a distance of 10 kms
        */
        AbstractVehicleFactory carFactory = CabBookingFactoryProvider.getVehicleFactory("Car");
        CabBookingSystem miniCar = carFactory.getVehicle("Mini");
        miniCar.book(distance);


        /*
        * Book a Personal Auto for a distance of 10 kms
        */
        AbstractVehicleFactory autoFactory = CabBookingFactoryProvider.getVehicleFactory("Auto");
        CabBookingSystem personalAuto = autoFactory.getVehicle("Personal");
        personalAuto.book(distance);


        /*
        * Book a Sports Bike for a distance of 10 kms
        */
        AbstractVehicleFactory bikeFactory = CabBookingFactoryProvider.getVehicleFactory("Bike");
        CabBookingSystem sportsBike = bikeFactory.getVehicle("Sports");
        sportsBike.book(distance);

    }
}
