package structrual.facade;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/3/4 20:42
 */
public class RISCCodeGenerator extends CodeGenerator {
    @Override
    public void visit(final StatementNode node) {
        System.out.println("RISCCodeGenerator visit");
    }

    @Override
    public void visit(final ExpressionNode node) {
        System.out.println("RISCCodeGenerator visit");
    }
}
