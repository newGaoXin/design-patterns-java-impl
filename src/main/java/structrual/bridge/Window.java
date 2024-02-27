package structrual.bridge;

/**
 * Window
 *
 * @author newgaoxin
 * @date 2024/2/27 20:08
 */
public abstract class Window {

    private final WindowImpl windowImpl;

    public Window(final WindowImpl windowImpl) {
        this.windowImpl = windowImpl;
    }

    public WindowImpl getWindowImpl() {
        return windowImpl;
    }

    protected abstract void drawContent(Point point1, Point point2);

    protected abstract void open();

}
