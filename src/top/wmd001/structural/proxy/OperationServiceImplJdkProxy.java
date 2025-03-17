package top.wmd001.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理实现
 */
public class OperationServiceImplJdkProxy implements InvocationHandler {

    Object target;

    public OperationServiceImplJdkProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        System.out.println("JDK Proxy Before");
        result = method.invoke(target, args);
        System.out.println("JDK Proxy After");
        return result;
    }

    public static Object getProxyInstance(OperationService operationService) {
        return Proxy.newProxyInstance(operationService.getClass().getClassLoader(), operationService.getClass().getInterfaces(), new OperationServiceImplJdkProxy(operationService));
    }

}
