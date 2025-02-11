package top.wmd001.creational.abstract_factory;

/**
 * Create by habit on 2024/7/11
 */
public class OracleConnection implements DBConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to Oracle database...");
    }
}
