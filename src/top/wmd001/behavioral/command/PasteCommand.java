package top.wmd001.behavioral.command;

public class PasteCommand implements Command{

    private TextEditor textEditor;

    public PasteCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.paste();
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
