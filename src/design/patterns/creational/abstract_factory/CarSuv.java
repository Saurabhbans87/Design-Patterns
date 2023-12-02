package design.patterns.creational.abstract_factory;

public class CarSuv extends CarBooking {

    public CarSuv(){};

    @Override
    public void setVehicleType(){
        carType = "Mega";
    }

    @Override
    public void setBaseCost(){
        baseCost = 150;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 30;
    }
}
