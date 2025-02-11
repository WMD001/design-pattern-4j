package top.wmd001.structural.decorator;

/**
 * 客户端代码
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        System.out.println("Original: " + component.operation());

        Component decorated1 = new ConcreteDecoratorA(component);
        System.out.println("Decorated with A: " + decorated1.operation());

        Component decorated2 = new ConcreteDecoratorB(decorated1);
        System.out.println("Decorated with A and B: " + decorated2.operation());
    }
}
