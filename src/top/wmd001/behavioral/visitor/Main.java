package top.wmd001.behavioral.visitor;

public class Main {

    public static void main(String[] args) {
        FileElement fileElement = new FileElement("E:\\Document\\2023B站面试视频");
        FileScanVisitor fileScanVisitor = new FileScanVisitor();

        fileElement.handle(fileScanVisitor);
    }

}
