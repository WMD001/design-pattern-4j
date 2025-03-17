package top.wmd001.structural.proxy;

public class Client {

    public static void main(String[] args) {
        // 使用静态代理执行代理方法
        OperationService operationService = new OperationServiceImpl();
        OperationService operationServiceProxy = new OperationServiceImplProxy(operationService);
        operationServiceProxy.operation();


        // 使用JDK动态代理执行代理方法
        OperationService operationServiceJdkProxy = (OperationService) OperationServiceImplJdkProxy.getProxyInstance(operationService);
        operationServiceJdkProxy.operation();



    }

}
