package structrual.decorator;

/**
 * demo
 *
 * @author newgaoxin
 * @date 2024/3/2 16:17
 */
public class Main {

    public static void main(String[] args) {
        final Window window = new Window();
        final TextView textView = new TextView();

        window.setContens(new BorderDecorator(new ScrollDecorator(textView), 10));
        window.draw();
    }
}
