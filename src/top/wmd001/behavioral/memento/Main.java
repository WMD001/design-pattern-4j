package top.wmd001.behavioral.memento;

public class Main {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        TextEditor editor = new TextEditor();
        editor.add("Hello");
        editor.add(" ");
        editor.add("World");
        editor.add('!');

        caretaker.save(new Snapshot(editor.getState()));

        editor.add('\n');
        editor.add("This is a test.");

        editor.print();

        System.out.println("Restoring to first state...");
        editor.setState(caretaker.restore().getState());
        editor.print();

    }
}
