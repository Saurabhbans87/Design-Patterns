package design.patterns.creational.abstract_factory;

public class AutoPersonal extends AutoBooking {

    public AutoPersonal(){}

    @Override
    public void setVehicleType(){
        shareType = "Personal";
    }

    @Override
    public void setBaseCost(){
        baseCost = 10;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 15;
    }
}
