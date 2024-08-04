package main.java.top.wmd001.creational.builder;

public abstract class AbstractCarBuilder {
    protected Car car;

    public AbstractCarBuilder() {
        this.car = createCar();
    }

    protected abstract Car createCar();

    public abstract void buildModel();

    public abstract void buildEngine();

    public abstract void buildColor();

    public Car getCar() {
        return car;
    }
}
