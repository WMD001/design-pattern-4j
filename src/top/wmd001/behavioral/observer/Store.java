package top.wmd001.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {

    private final List<ProductObserver> observers;
    private final Map<String, Product> products;

    public Store() {
        this.observers = new ArrayList<>();
        this.products = new HashMap<>();
    }

    public void publish(Product product) {
        for (ProductObserver observer : this.observers) {
            observer.onPublish(product);
        }
    }

    public void register(ProductObserver observer) {
        this.observers.add(observer);
    }

    public void unregister(ProductObserver observer) {
        this.observers.remove(observer);
    }

    public void addProduct(Product product) {
        System.out.println("商店上架产品：" + product.getName() + "，价格：" + product.getPrice() );
        this.products.put(product.getName(), product);
        this.publish(product);
    }

    public Product getProduct(String name) {
        return this.products.get(name);
    }

}
