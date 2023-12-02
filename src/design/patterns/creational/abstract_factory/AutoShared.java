package design.patterns.creational.abstract_factory;

public class AutoShared extends AutoBooking {

    public AutoShared(){}

    @Override
    public void setVehicleType(){
        shareType = "Shared";
    }

    @Override
    public void setBaseCost(){
        baseCost = 0;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 10;
    }
}
