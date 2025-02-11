package top.wmd001.structural.composite;

public class Client {

    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("1");
        Leaf leaf2 = new Leaf("2");

        Composite composite = new Composite();
        composite.add(leaf1);
        composite.add(leaf2);

        Composite root = new Composite();
        root.add(composite);
        root.add(new Leaf("3"));

        root.operation();
    }

}
