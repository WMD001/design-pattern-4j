package top.wmd001.behavioral.template_method;

import java.util.List;
import java.util.Map;

public abstract class IndexData {

    public abstract List<Map<String, Object>> getData();

    public void save() {
        List<Map<String, Object>> data = this.getData();
        System.out.println("Saving data...");
    }


}
