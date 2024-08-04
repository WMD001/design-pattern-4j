package main.java.top.wmd001.creational.builder;

public class Director {
    private AbstractCarBuilder builder;

    public Director(AbstractCarBuilder builder) {
        this.builder = builder;
    }

    public Car constructCar() {
        builder.buildModel();
        builder.buildEngine();
        builder.buildColor();
        return builder.getCar();
    }
}
