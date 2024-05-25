package heaver.chainrepository;

/**
 * main 方法
 *
 * @author newgaoxin
 * @date 2024/3/9 22:00
 */
public class Main {

    public static void main(String[] args) {
        final Dialog dialog = new Dialog(null);
        final Button button = new Button(dialog);
        final Widget widget = new Widget(button);
        

        final boolean help = widget.help("123");
        System.out.println(help);
    }
}
