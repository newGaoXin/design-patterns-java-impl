package structrual.bridge;

/**
 * 主入口
 *
 * @author newgaoxin
 * @date 2024/2/27 21:13
 */
public class Main {

    public static void main(String[] args) {
        final XWindowImp xWindowImp = new XWindowImp();
        Window window = new ApplicationWindow(xWindowImp);
        window.open();
    }
}
