package main.java.top.wmd001.structural.facade;

public class Client {

    public static void main(String[] args) {
        // 创建外观对象
        MultimediaFacade multimediaFacade = new MultimediaFacade();

        // 使用外观接口启动电影
        multimediaFacade.startMovie("The Matrix");

        // 使用外观接口关闭电影
        multimediaFacade.endMovie();
    }

}
