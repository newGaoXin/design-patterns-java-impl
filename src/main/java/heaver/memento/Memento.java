package heaver.memento;

/**
 * 备忘录
 *
 * @author newgaoxin
 * @date 2024/5/30 21:16
 */
public class Memento {

    private final Runner runner;

    public Memento(final Runner runner) {
        this.runner = runner;
    }

    public Runner getRunner() {
        return runner;
    }
}
