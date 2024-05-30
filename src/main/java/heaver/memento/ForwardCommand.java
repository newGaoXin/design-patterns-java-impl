package heaver.memento;

/**
 * 前进命令
 *
 * @author newgaoxin
 * @date 2024/5/30 21:28
 */
public class ForwardCommand implements Command {

    /**
     * 距离
     */
    private final int distance;

    public ForwardCommand(final int distance) {
        this.distance = distance;
    }

    @Override
    public Memento execute(final Runner runner) {
        final Memento memento = runner.createMemento();
        runner.forward(distance);
        return memento;
    }
}
