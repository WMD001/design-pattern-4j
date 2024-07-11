package main.java.top.wmd001.creational.abstract_factory;

/**
 * Create by habit on 2024/7/11
 */
public class MysqlFactory implements DBFactory {
    @Override
    public DBConnection getConnection() {
        return new MysqlConnection();
    }

    @Override
    public DBCommand getCommand() {
        return new MysqlCommand();
    }
}
