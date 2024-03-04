package structrual.facade;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/3/4 20:21
 */
public class ExpressionNode extends ProgramNode {
    @Override
    public void getSourcePosition(final int line, final int index) {

    }

    @Override
    public void add(final ProgramNode programNode) {

    }

    @Override
    public void remove(final ProgramNode programNode) {

    }

    @Override
    public void traverse(final CodeGenerator codeGenerator) {
        codeGenerator.visit(this);

        super.nodes.forEach(node -> node.traverse(codeGenerator));
    }
}
