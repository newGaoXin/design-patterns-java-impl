package heaver.visitor;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/6/8 20:02
 */
public class PrintVisitor implements Visitor {

    public void print(final Node... nodes) {
        for (final Node node : nodes) {
            node.accept(this);
        }
    }

    @Override
    public void visitAssignment(final AssignmentNode node) {
        System.out.println("AssignmentNode ...");
    }

    @Override
    public void visitVariableRef(final VariableRefNode node) {
        System.out.println("VariableRefNode ...");
    }
}
