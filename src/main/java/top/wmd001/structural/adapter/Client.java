package main.java.top.wmd001.structural.adapter;

import java.util.List;


/**
 * 适配器模式，用于将一个接口的数据转成另一个接口可以支持的形式。
 * 通俗的将，就是一种不能支持的数据格式转换成另一种可以支持并使用的格式。有此行为的代码结构都可以认为是适配器。
 */
public class Client {

    public static void main(String[] args) {

        FieldSortAdapter fieldSortAdapter = new FieldSortAdapter();

        String sort = "createDate:desc";
        FieldSort sort1 = fieldSortAdapter.sort(sort);

        String sorts = "createDate:desc#score_desc";
        List<FieldSort> sorts1 = fieldSortAdapter.sorts(sorts);

    }

}
