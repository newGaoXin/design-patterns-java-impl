package heaver.visitor;

/**
 * 访问者模式 demo
 *
 * @author newgaoxin
 * @date 2024/6/8 19:44
 */
public class Demo {

    public static void main(String[] args) {

        final Node element = new AssignmentNode();
        final Node variableRefNode = new VariableRefNode();
        final PrintVisitor visitor = new PrintVisitor();
        visitor.print(element, variableRefNode);
    }
}
