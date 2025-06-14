package top.wmd001.behavioral.memento;

import java.util.Stack;

public class Caretaker {

    private Stack<Snapshot> snapshots;

    public Caretaker() {
        this.snapshots = new Stack<>();
    }

    public void save(Snapshot snapshot) {
        snapshots.push(snapshot);
    }

    public Snapshot restore() {
        return snapshots.pop();
    }

}
