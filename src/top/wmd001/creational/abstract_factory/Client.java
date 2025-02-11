package top.wmd001.creational.abstract_factory;

/**
 * Create by habit on 2024/7/11
 */
public class Client {

    private DBConnection connection;
    private DBCommand command;

    public Client(DBFactory factory) {
        this.connection = factory.getConnection();
        this.command = factory.getCommand();
    }

    public void execute() {
        connection.connect();
        command.execute("select * from user");
    }

    public static void main(String[] args) {
        DBFactory factory;

        factory = new MysqlFactory();
        Client client1 = new Client(factory);
        client1.execute();

        factory = new OracleFactory();
        Client client2 = new Client(factory);
        client2.execute();

    }


}
