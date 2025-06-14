package top.wmd001.behavioral.template_method;

public class Main {
    public static void main(String[] args) {
        IndexData indexData = new IndexMysqlData();
        indexData.save();
        indexData = new IndexOracleData();
        indexData.save();
    }
}
