package top.wmd001.behavioral.chain_of_responsibility;

import java.util.ArrayList;
import java.util.List;

public class CustomFilterChain implements FilterChain{

    private final List<Filter> filters = new ArrayList<>();
    private static int pos = 0;


    public void addFilter(Filter filter) {
        filters.add(filter);
    }


    @Override
    public void doFilter(CustomInfo customInfo) {
        if (pos < filters.size()) {
            Filter filter = filters.get(pos);
            pos++;
            filter.doFilter(customInfo, this);
        }
    }



}
