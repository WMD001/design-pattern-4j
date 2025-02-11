package top.wmd001.creational.builder;

public class SedanBuilder extends AbstractCarBuilder {
    @Override
    protected Car createCar() {
        return new Sedan("Sedan", null, null);
    }

    @Override
    public void buildModel() {
        car.setModel("Sedan");
    }

    @Override
    public void buildEngine() {
        car.setEngine("2.0L Turbo");
    }

    @Override
    public void buildColor() {
        car.setColor("Red");
    }
}