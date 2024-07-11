package main.java.top.wmd001.creational.abstract_factory;

/**
 * Create by habit on 2024/7/11
 */
public class MysqlCommand implements DBCommand{
    @Override
    public void execute(String query) {
        System.out.println("Executing MySQL query: " + query);
    }
}
