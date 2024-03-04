package structrual.facade;

import java.io.InputStream;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/3/4 20:32
 */
public abstract class Compiler {

    public void compile(InputStream inputStream, BytecodeStream bytecodeStream) {
        final Scanner scanner = new Scanner(inputStream);
        final ProgramNodeBuilder programNodeBuilder = new ProgramNodeBuilder(new ExpressionNode());
        final Parser parser = new Parser();

        parser.parse(scanner, programNodeBuilder);
        final RISCCodeGenerator generator = new RISCCodeGenerator();

        final ProgramNode rootNode = programNodeBuilder.getRootNode();
        rootNode.traverse(generator);
    }

}
