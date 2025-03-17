package top.wmd001.structural.proxy;

/**
 * 静态代理，代理类和被代理类实现同一个接口，代理类持有被代理类的引用，代理类实现代理方法，代理方法调用被代理类的方法
 * 代理类和被代理类之间强耦合
 *
 * @see top.wmd001.structural.proxy.OperationServiceImpl
 * @author wmd
 */
public class OperationServiceImplProxy implements OperationService {

    private final OperationService operationService;

    public OperationServiceImplProxy(OperationService operationService) {
        this.operationService = operationService;
    }

    @Override
    public void operation() {
        // 代理操作
        System.out.println("OperationServiceImplProxy operation.");
        operationService.operation();
    }
}
