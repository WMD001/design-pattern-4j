package top.wmd001.creational.abstract_factory;

/**
 * Create by habit on 2024/7/11
 */
public class OracleFactory implements DBFactory {
    @Override
    public DBConnection getConnection() {
        return new OracleConnection();
    }

    @Override
    public DBCommand getCommand() {
        return new OracleCommand();
    }
}
