package top.wmd001.behavioral.chain_of_responsibility;

public class Client {

    public static void main(String[] args) {
        CustomFilterChain filterChain = new CustomFilterChain();
        filterChain.addFilter(new UsernameFilter());
        filterChain.addFilter(new RoleFilter());


        CustomInfo customInfo = new CustomInfo();
//        customInfo.setName("张三");

        customInfo.setName("Blob");
        customInfo.setRoleCode("admin");
        filterChain.doFilter(customInfo);

    }

}
