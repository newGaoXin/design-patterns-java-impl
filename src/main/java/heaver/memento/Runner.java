package heaver.memento;

/**
 * 跑步的人
 *
 * @author newgaoxin
 * @date 2024/5/30 21:11
 */
public class Runner implements Cloneable {

    private final History history;
    private int runDistance;

    public Runner() {
        this.history = new History();
        runDistance = 0;
    }

    public Runner(final History history, final int runDistance) {
        this.history = history;
        this.runDistance = runDistance;
    }

    public void execute(Command command) throws CloneNotSupportedException {
        final Memento execute = command.execute(this);
        this.history.push(command, execute);
    }

    protected Memento createMemento() {
        return new Memento(this.clone());
    }

    @Override
    protected Runner clone() {
        return new Runner(this.history, this.runDistance);
    }

    public void undo() {
        final History.Pair undoPair = this.history.getUndoPair();
        final Memento memento = undoPair.getMemento();
        this.useMemento(memento);
    }

    private void useMemento(final Memento memento) {
        this.runDistance = memento.getRunner().runDistance;
    }

    public void redo() {
        final History.Pair redoPair = this.history.getRedoPair();
        final Memento memento = redoPair.getMemento();
        this.useMemento(memento);
    }


    public int getRunDistance() {
        return runDistance;
    }

    public void forward(final int distance) {
        this.runDistance += distance;
    }

    public void back(final int distance) {
        this.runDistance -= distance;
    }
}
