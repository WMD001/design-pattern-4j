package main.java.top.wmd001.creational.factory_method;

/**
 * Create by habit on 2024/6/26
 */
public interface DatabaseConnection {

    void connect(String url, String username, String password);

    void disconnect();

}
