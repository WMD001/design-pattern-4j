package top.wmd001.behavioral.observer;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        Admin admin = new Admin();
        store.register(admin);
        Customer customer = new Customer();
        store.register(customer);

        store.addProduct(new Product("iPhone 6s", 5000));
        store.addProduct(new Product("MacBook Pro", 20000));
        store.addProduct(new Product("MacBook Air", 12000));
    }

}
