package heaver.visitor;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/6/8 20:00
 */
public class AssignmentNode extends Node {


    @Override
    public void accept(final Visitor visitor) {
        visitor.visitAssignment(this);
    }
}
