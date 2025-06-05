package top.wmd001.behavioral.chain_of_responsibility;

public class RoleFilter implements Filter{


    @Override
    public void doFilter(CustomInfo customInfo, FilterChain filterChain) {
        if ("admin".equals(customInfo.getRoleCode())) {
            System.out.println("admin");
            filterChain.doFilter(customInfo);
        } else {
            System.out.println("Role not admin, chain stopped");
        }
    }
}
