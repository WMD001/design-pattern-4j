package top.wmd001.behavioral.command;

public class CopyCommand implements Command{

    private TextEditor textEditor;

    public CopyCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.copy();
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
