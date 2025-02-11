package top.wmd001.structural.decorator;

/**
 * 具体组件类
 */
public class ConcreteComponent implements Component {
    @Override
    public String operation() {
        return "ConcreteComponent";
    }
}