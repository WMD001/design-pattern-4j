package top.wmd001.behavioral.observer;

public class Admin implements ProductObserver {

    @Override
    public void onPublish(Product product) {
        System.out.println("Admin: " + product.getName() + " is published.");
        System.out.println("管理员收到产品上架信息，检查商品名称和价格");
    }

}
