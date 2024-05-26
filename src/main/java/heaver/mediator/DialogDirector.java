package heaver.mediator;

/**
 * 对话框抽象类
 *
 * @author newgaoxin
 * @date 2024/5/26 22:05
 */
public abstract class DialogDirector {

    public abstract void showDialog();

    public abstract void widgetChanged(final Widget widget);

    public abstract void createWidgets();
}
