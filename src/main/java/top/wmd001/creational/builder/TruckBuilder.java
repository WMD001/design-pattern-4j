package main.java.top.wmd001.creational.builder;

public class TruckBuilder extends AbstractCarBuilder {
    @Override
    protected Car createCar() {
        return new Truck("Truck", null, null);
    }

    @Override
    public void buildModel() {
        car.setModel("Truck");
    }

    @Override
    public void buildEngine() {
        car.setEngine("3.5L V6");
    }

    @Override
    public void buildColor() {
        car.setColor("Blue");
    }
}
