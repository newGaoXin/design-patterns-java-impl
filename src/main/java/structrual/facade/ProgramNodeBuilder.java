package structrual.facade;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/3/4 20:13
 */
public class ProgramNodeBuilder {

    private ProgramNode node;

    public ProgramNodeBuilder(ProgramNode node) {
        this.node = node;
    }

    public ProgramNode newVariable(String variableName) {
        return null;
    }

    public ProgramNode newAssignment(ProgramNode variable, ProgramNode expression) {
        return null;
    }

    public ProgramNode newReturnStatement(ProgramNode value) {
        return null;
    }

    public ProgramNode newCondition(ProgramNode condition, ProgramNode truePart, ProgramNode falsePart) {
        return null;
    }

    public ProgramNode getRootNode() {
        return this.node;
    }
}
