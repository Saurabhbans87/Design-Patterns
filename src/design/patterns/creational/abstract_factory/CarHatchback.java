package design.patterns.creational.abstract_factory;

public class CarHatchback extends CarBooking {

    public CarHatchback(){};

    @Override
    public void setVehicleType(){
        carType = "Micro";
    }

    @Override
    public void setBaseCost(){
        baseCost = 50;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 10;
    }
}
