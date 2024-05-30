package heaver.memento;

import java.util.Stack;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/5/30 21:12
 */
public class History {

    private Stack<Pair> pairs = new Stack<>();
    private int virtualSize = 0;

    /**
     * 添加
     *
     * @param command
     * @param memento
     */
    public void push(Command command, Memento memento) {
        if (virtualSize != pairs.size() && virtualSize > 0) {
            this.pairs.subList(virtualSize, pairs.size() - 1);
        }
        this.pairs.push(new Pair(command, memento));
    }

    /**
     * 撤消
     *
     * @return
     */
    public Pair getUndoPair() {
        return this.pairs.get(virtualSize--);
    }

    /**
     * 重做
     */
    public Pair getRedoPair() {
        return this.pairs.get(++virtualSize);
    }

    public class Pair {

        private final Command command;

        private final Memento memento;

        public Pair(final Command command, final Memento memento) {
            this.command = command;
            this.memento = memento;
        }

        public Command getCommand() {
            return command;
        }

        public Memento getMemento() {
            return memento;
        }
    }

}
