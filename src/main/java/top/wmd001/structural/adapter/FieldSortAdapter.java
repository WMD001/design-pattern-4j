package main.java.top.wmd001.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class FieldSortAdapter {

    public FieldSort sort(String sort) {
        String[] split = sort.split(":");
        FieldSort fieldSort = new FieldSort();
        fieldSort.setField(split[0]);
        fieldSort.setOrder(split[1]);
        return fieldSort;
    }

    public List<FieldSort> sorts(String sort) {
        String[] split = sort.split("#");
        return Arrays.stream(split).map(s -> {
            FieldSort fieldSort = new FieldSort();
            fieldSort.setField(s.split(":")[0]);
            fieldSort.setOrder(s.split(":")[1]);
            return fieldSort;
        }).toList();
    }

}
