package main.java.top.wmd001.creational.builder;

public class Main {

    public static void main(String[] args) {
        Director director = new Director(new SedanBuilder());
        Car sedan = director.constructCar();
        System.out.println(sedan);

        director = new Director(new TruckBuilder());
        Car truck = director.constructCar();
        System.out.println(truck);
    }

}
