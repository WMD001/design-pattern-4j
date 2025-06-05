package top.wmd001.behavioral.chain_of_responsibility;

public interface Filter {

    void doFilter(CustomInfo customInfo, FilterChain filterChain);

}
