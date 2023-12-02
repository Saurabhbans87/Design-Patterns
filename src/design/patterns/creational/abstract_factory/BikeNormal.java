package design.patterns.creational.abstract_factory;

public class BikeNormal extends BikeBooking {

    public BikeNormal(){}

    @Override
    public void setVehicleType(){
        bikeType = "Normal";
    }

    @Override
    public void setBaseCost(){
        baseCost = 20;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 5;
    }
}
