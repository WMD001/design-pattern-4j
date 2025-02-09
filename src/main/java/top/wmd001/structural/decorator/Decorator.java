package main.java.top.wmd001.structural.decorator;

/**
 * 基础装饰类
 */
public class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        return component.operation();
    }
}