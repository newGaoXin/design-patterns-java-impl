package heaver.mediator;

/**
 * 中介者模式 demo
 *
 * @author newgaoxin
 * @date 2024/5/26 22:29
 */
public class Demo {

    public static void main(String[] args) {
        final FontDialogDirector fontDialogDirector = new FontDialogDirector();
        fontDialogDirector.createWidgets();
        fontDialogDirector.clickOk();
    }
}
