package structrual.decorator;

/**
 * 装饰器
 *
 * @author newgaoxin
 * @date 2024/3/2 16:08
 */
public abstract class Decorator extends VisualComponent {

    /**
     * 装饰的可视化组件
     */
    protected VisualComponent component;

    public Decorator(final VisualComponent component) {
        this.component = component;
    }

    @Override
    public void draw() {
        this.component.draw();
    }

    @Override
    public void resize() {
        this.component.resize();
    }
}
