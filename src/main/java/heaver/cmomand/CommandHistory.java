package heaver.cmomand;

import java.util.Stack;

/**
 * 命令历史
 *
 * @author newgaoxin
 * @date 2024/5/18 16:48
 */
public class CommandHistory {

    private final Stack<Command> history = new Stack<>();

    public void push(Command command) {
        this.history.push(command);
    }

    public Command pop() {
        return this.history.pop();
    }
}
