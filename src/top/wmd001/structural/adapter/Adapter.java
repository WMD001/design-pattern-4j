package top.wmd001.structural.adapter;

public class Adapter implements ClientInterface{

    private Service service;

    public Adapter(Service service) {
        this.service = service;
    }

    @Override
    public void request() {
        service.specificRequest();
    }
}
