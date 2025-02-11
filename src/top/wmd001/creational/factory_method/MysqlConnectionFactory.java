package top.wmd001.creational.factory_method;

/**
 * Create by habit on 2024/6/26
 */
public class MysqlConnectionFactory implements DatabaseConnectionFactory {
    @Override
    public DatabaseConnection createConnection() {
        return new MysqlConnection();
    }
}
