package heaver.visitor;

/**
 * 访问者接口
 *
 * @author newgaoxin
 * @date 2024/6/8 19:56
 */
public interface Visitor {


    public void visitAssignment(AssignmentNode node);

    public void visitVariableRef(VariableRefNode node);
}
