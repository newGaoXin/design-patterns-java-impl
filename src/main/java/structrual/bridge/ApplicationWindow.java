package structrual.bridge;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/2/27 20:36
 */
public class ApplicationWindow extends Window {

    public ApplicationWindow(final WindowImpl windowImpl) {
        super(windowImpl);
    }

    @Override
    protected void drawContent(Point point1, Point point2) {
        final WindowImpl windowImpl = super.getWindowImpl();
        windowImpl.deviceRect(point1.getX(), point1.getY(), point2.getX(), point2.getY());
    }


    @Override
    protected void open() {
        final WindowImpl windowImpl = super.getWindowImpl();
        windowImpl.open();
    }
}
