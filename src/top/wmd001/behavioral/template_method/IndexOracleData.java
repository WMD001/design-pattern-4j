package top.wmd001.behavioral.template_method;

import java.util.List;
import java.util.Map;

public class IndexOracleData extends IndexData{
    @Override
    public List<Map<String, Object>> getData() {
        System.out.println("使用Oracle数据库获取数据");
        return List.of();
    }
}
