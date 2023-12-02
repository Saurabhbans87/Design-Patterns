package design.patterns.creational.abstract_factory;

public class BikeSports extends BikeBooking {

    public BikeSports(){}

    @Override
    public void setVehicleType(){
        bikeType = "Sports";
    }

    @Override
    public void setBaseCost(){
        baseCost = 40;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 15;
    }
}
