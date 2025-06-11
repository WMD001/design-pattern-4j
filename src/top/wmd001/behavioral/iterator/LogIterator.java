package top.wmd001.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class LogIterator {


    public static void log(String log, Object... param) {
        // 用于存储占位符 { } 的插入位置
        List<Integer> positions = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        // 遍历字符串，识别 {} 占位符
        for (int i = 0; i < log.length(); i++) {
            char item = log.charAt(i);
            if (item == '{' && i + 1 < log.length() && log.charAt(i + 1) == '}') {
                // 记录当前 builder 的长度作为插入点
                positions.add(builder.length());
                i += 1; // 跳过 }
            } else {
                builder.append(item);
            }
        }

        // 参数数量校验
        if (positions.size() != param.length) {
            throw new IllegalArgumentException("参数个数不匹配");
        }


        // 从后往前插入参数，避免插入位置偏移
        for (int i = positions.size() - 1; i >= 0; i--) {
            Integer pos = positions.get(i);
            builder.insert(pos, param[i]);
        }

        // 输出结果
        System.out.println(builder);
    }


}
