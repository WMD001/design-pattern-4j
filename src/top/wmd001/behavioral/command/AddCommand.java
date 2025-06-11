package top.wmd001.behavioral.command;

public class AddCommand implements Command{

    private TextEditor textEditor;
    private String text;

    public AddCommand(TextEditor textEditor,  String text) {
        this.textEditor = textEditor;
        this.text = text;
    }

    @Override
    public void execute() {
        textEditor.add(text);
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
