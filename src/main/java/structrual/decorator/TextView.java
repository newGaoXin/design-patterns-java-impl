package structrual.decorator;

/**
 * 文本视图
 *
 * @author newgaoxin
 * @date 2024/3/2 16:18
 */
public class TextView extends VisualComponent {


    @Override
    public void draw() {
        System.out.println("文本视图 draw");
    }

    @Override
    public void resize() {
        System.out.println("文本视图 resize");
    }
}
