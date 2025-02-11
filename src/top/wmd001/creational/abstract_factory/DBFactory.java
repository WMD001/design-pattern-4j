package top.wmd001.creational.abstract_factory;

/**
 * Create by habit on 2024/7/11
 */
public interface DBFactory {
    DBConnection getConnection();
    DBCommand getCommand();
}
