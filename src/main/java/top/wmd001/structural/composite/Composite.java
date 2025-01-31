package main.java.top.wmd001.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public Component getChild(int index) {
        return children.get(index);
    }

    @Override
    public void operation() {
        System.out.println("Composite operation.");
        for (Component child : children) {
            child.operation();
        }
    }
}
