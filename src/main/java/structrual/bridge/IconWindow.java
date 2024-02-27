package structrual.bridge;

/**
 * icon Window
 *
 * @author newgaoxin
 * @date 2024/2/27 20:09
 */
public class IconWindow extends Window {

    public IconWindow(final WindowImpl windowImpl) {
        super(windowImpl);
    }

    @Override
    protected void drawContent(final Point point1, final Point point2) {
        final WindowImpl windowImpl = this.getWindowImpl();
        windowImpl.deviceRect(point1.getX(), point1.getY(), point2.getX(), point2.getY());

        // 可能这里做些什么...
    }

    @Override
    protected void open() {
        this.open();
        final WindowImpl windowImpl = this.getWindowImpl();
        windowImpl.open();
    }

    private void openBegin() {
        // 可能打开做些什么
    }
}
