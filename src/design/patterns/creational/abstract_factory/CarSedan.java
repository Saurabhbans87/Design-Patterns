package design.patterns.creational.abstract_factory;

public class CarSedan extends CarBooking {

    public CarSedan(){};

    @Override
    public void setVehicleType(){
        carType = "Mini";
    }

    @Override
    public void setBaseCost(){
        baseCost = 100;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 20;
    }
}
