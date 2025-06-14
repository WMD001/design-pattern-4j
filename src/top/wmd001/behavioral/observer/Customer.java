package top.wmd001.behavioral.observer;

public class Customer implements ProductObserver{
    @Override
    public void onPublish(Product product) {
        System.out.println("Customer: " + product.getName() + " is published.");
        System.out.println("顾客收到产品上架信息，查看商品名称和价格");
    }
}
