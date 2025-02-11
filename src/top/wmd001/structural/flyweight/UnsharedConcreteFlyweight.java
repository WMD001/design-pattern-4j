package top.wmd001.structural.flyweight;

public class UnsharedConcreteFlyweight implements Flyweight {
    private final String allState;

    public UnsharedConcreteFlyweight(String allState) {
        this.allState = allState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("All State: " + allState);
    }
}