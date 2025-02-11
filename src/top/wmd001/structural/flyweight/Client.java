package top.wmd001.structural.flyweight;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.getFlyweight("A");
        flyweight1.operation("First Call");

        Flyweight flyweight2 = factory.getFlyweight("B");
        flyweight2.operation("Second Call");

        Flyweight flyweight3 = factory.getFlyweight("A");
        flyweight3.operation("Third Call");

        UnsharedConcreteFlyweight unsharedFlyweight = new UnsharedConcreteFlyweight("Unshared State");
        unsharedFlyweight.operation("Unshared Call");
    }
}