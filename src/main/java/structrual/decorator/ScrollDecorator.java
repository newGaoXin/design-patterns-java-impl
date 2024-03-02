package structrual.decorator;

/**
 * 滚动装饰器
 *
 * @author newgaoxin
 * @date 2024/3/2 16:31
 */
public class ScrollDecorator extends Decorator {


    public ScrollDecorator(final VisualComponent component) {
        super(component);
    }

    @Override
    public void draw() {
        System.out.println("滚动装饰器");
        super.component.draw();
    }

    @Override
    public void resize() {
        System.out.println("滚动装饰器");
    }
}
