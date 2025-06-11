package top.wmd001.behavioral.command;

public class DeleteCommand implements Command{

    private TextEditor textEditor;
    private String deletedText;

    private boolean canRedo = false;
    private boolean canUndo = true;

    public DeleteCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        deletedText = String.valueOf(textEditor.getState().charAt(textEditor.getState().length()-1));
        textEditor.delete();
    }

    @Override
    public void undo() {
        if (canUndo) {
            textEditor.add(deletedText);
            canRedo = true;
        }
    }

    @Override
    public void redo() {
        if (canRedo) {
            textEditor.delete();
            canRedo = false;
        }
    }
}
