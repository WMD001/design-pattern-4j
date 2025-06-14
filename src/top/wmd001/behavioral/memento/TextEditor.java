package top.wmd001.behavioral.memento;

public class TextEditor {

    private StringBuilder builder = new StringBuilder();

    public void add(char ch) {
        builder.append(ch);
    }

    public void add(String s) {
        builder.append(s);
    }

    public void delete() {
        if (builder.length() > 0) {
            builder.deleteCharAt(builder.length() - 1);
        }
    }

    // 获取状态:
    public String getState() {
        return builder.toString();
    }

    // 恢复状态:
    public void setState(String state) {
        this.builder.delete(0, this.builder.length());
        this.builder.append(state);
    }

    public void print() {
        System.out.println("===Start:");
        System.out.println(builder);
        System.out.println("===End.");
    }

}
