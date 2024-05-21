package heaver.cmomand;

/**
 * demo
 *
 * @author newgaoxin
 * @date 2024/5/18 15:52
 */
public class Demo {

    public static void main(String[] args) {
        final Application application = new Application();
        Command command = new OpenCommand(application);
        command.execute();
    }
}
