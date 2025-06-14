package top.wmd001.behavioral.template_method;

import java.util.List;
import java.util.Map;

public class IndexMysqlData extends IndexData {
    @Override
    public List<Map<String, Object>> getData() {
        System.out.println("从mysql数据库中获取数据");
        return List.of();
    }
}
