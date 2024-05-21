package heaver.cmomand;

/**
 * 打开 命名
 *
 * @author newgaoxin
 * @date 2024/5/18 16:04
 */
public class OpenCommand extends Command {

    private final Application application;
    /**
     * 要打开的文档
     */
    private String askUser;

    public OpenCommand(final Application application) {
        this.application = application;
    }

    @Override
    public void execute() {
        // todo 打开文档
    }
}
