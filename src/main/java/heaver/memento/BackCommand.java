package heaver.memento;

/**
 * 后退命令
 *
 * @author newgaoxin
 * @date 2024/5/30 21:37
 */
public class BackCommand implements Command {

    /**
     * 距离
     */
    private final int distance;

    public BackCommand(final int distance) {
        this.distance = distance;
    }

    @Override
    public Memento execute(final Runner runner) {
        final Memento memento = runner.createMemento();
        runner.back(distance);
        return memento;
    }
}
