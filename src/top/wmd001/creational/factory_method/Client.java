package top.wmd001.creational.factory_method;

/**
 * Create by habit on 2024/6/26
 */
public class Client {

    public static void main(String[] args) {
        DatabaseConnectionFactory factory = new MysqlConnectionFactory();
        DatabaseConnection connection = factory.createConnection();
        connection.connect("jdbc:mysql://localhost:3306/test", "root", "123456");
        connection.disconnect();

        factory = new OracleConnectionFactory();
        connection = factory.createConnection();
        connection.connect("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
        connection.disconnect();


    }

}
