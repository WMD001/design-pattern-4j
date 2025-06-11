package top.wmd001.behavioral.command;

public class Client {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        Command add = new AddCommand(textEditor, "Hello World!");
        Command copy = new CopyCommand(textEditor);
        Command paste = new PasteCommand(textEditor);
        Command delete = new DeleteCommand(textEditor);

        add.execute();
        System.out.print("After AddCommand: ");
        textEditor.print();

        copy.execute();
        System.out.print("After CopyCommand: ");
        textEditor.print();

        paste.execute();
        System.out.print("After PasteCommand: ");
        textEditor.print();

        delete.execute();
        System.out.print("After DeleteCommand: ");
        textEditor.print();

        delete.undo();
        System.out.print("After DeleteCommand.undo(): ");
        textEditor.print();

        delete.redo();
        System.out.print("After DeleteCommand.redo(): ");
        textEditor.print();

    }

}
