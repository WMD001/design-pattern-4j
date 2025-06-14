package top.wmd001.behavioral.visitor;

public class FileElement {

    private String path;

    public FileElement(String path) {
        this.path = path;
    }

    public void handle(Visitor visitor) {
        visitor.visit(this);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
