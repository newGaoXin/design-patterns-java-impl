package heaver.visitor;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/6/8 20:03
 */
public class VariableRefNode extends Node {

    @Override
    public void accept(final Visitor visitor) {
        visitor.visitVariableRef(this);
    }
}
