package heaver.mediator;

/**
 * 窗口组件的抽象基类
 *
 * @author newgaoxin
 * @date 2024/5/26 22:07
 */
public abstract class Widget {

    private final DialogDirector dialogDirector;

    public Widget(DialogDirector dialogDirector) {
        this.dialogDirector = dialogDirector;
    }

    /**
     * 鼠标点击事件
     */
    public abstract void handleMouse();

    protected void changed() {
        this.dialogDirector.widgetChanged(this);
    }
}
