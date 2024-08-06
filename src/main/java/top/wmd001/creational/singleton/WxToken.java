package main.java.top.wmd001.creational.singleton;

/**
 * Create by habit on 2024/8/6
 */
public class WxToken {

    private String token;
    private static WxToken wxToken;

    private WxToken() {
    }

    public static WxToken getInstance() {
        if (wxToken == null) {
            wxToken = new WxToken();
        }
        return wxToken;
    }

    public String getToken() {
        return token;
    }

    public void login() {
        // 忽略登录验证过程
        wxToken.token = "x123456789";
    }

    public static void main(String[] args) {
        WxToken wxToken = WxToken.getInstance();
        wxToken.login();
        System.out.println(wxToken.getToken());
    }

}
