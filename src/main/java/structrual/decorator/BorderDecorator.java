package structrual.decorator;

/**
 * 边框装饰器
 *
 * @author newgaoxin
 * @date 2024/3/2 16:11
 */
public class BorderDecorator extends Decorator {

    private int width;

    public BorderDecorator(final VisualComponent component, int borderWidth) {
        super(component);
        this.width = borderWidth;
    }

    @Override
    public void draw() {
        System.out.println("边框装饰器 draw");
        super.component.draw();
        this.drawBorder();
    }

    @Override
    public void resize() {
        super.resize();
    }

    private void drawBorder() {
        System.out.println("绘制边框 " + this.width);
    }
}
