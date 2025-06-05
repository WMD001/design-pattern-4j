package top.wmd001.behavioral.chain_of_responsibility;

public class UsernameFilter implements Filter{
    @Override
    public void doFilter(CustomInfo customInfo, FilterChain filterChain) {
        if ("Blob".equals(customInfo.getName())) {
            System.out.println("Blob");
            filterChain.doFilter(customInfo);
        } else {
            System.out.println("Name not Blob, chain stopped");
        }
    }
}
