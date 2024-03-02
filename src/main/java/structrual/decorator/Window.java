package structrual.decorator;

/**
 * 系统
 *
 * @author newgaoxin
 * @date 2024/3/2 16:16
 */
public class Window {

    private VisualComponent component;

    public void setContens(VisualComponent component) {
        this.component = component;
    }

    public void draw() {
        this.component.draw();
    }
}
