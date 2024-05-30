package heaver.memento;

/**
 * 命令
 *
 * @author newgaoxin
 * @date 2024/5/30 21:16
 */
public interface Command {

    Memento execute(final Runner runner);
}
