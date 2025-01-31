package main.java.top.wmd001.structural.adapter;

public class Client {

    public static void main(String[] args) {
        Service service = new Service();
        ClientInterface adapter = new Adapter(service);
        adapter.request();
    }

}
