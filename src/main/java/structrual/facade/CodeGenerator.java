package structrual.facade;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/3/4 20:21
 */
public abstract class CodeGenerator {

    protected BytecodeStream output;

    protected CodeGenerator() {
    }

    public abstract void visit(StatementNode node);

    public abstract void visit(ExpressionNode node);
}
