package structrual.facade;

import java.util.List;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/3/4 20:14
 */
public abstract class ProgramNode {

    protected List<ProgramNode> nodes;

    protected ProgramNode() {
    }

    public abstract void getSourcePosition(int line, int index);

    public abstract void add(ProgramNode programNode);

    public abstract void remove(ProgramNode programNode);

    public abstract void traverse(CodeGenerator codeGenerator);
}
