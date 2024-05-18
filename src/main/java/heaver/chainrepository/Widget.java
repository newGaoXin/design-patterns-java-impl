package heaver.chainrepository;

/**
 * Widget
 *
 * @author newgaoxin
 * @date 2024/3/9 21:45
 */
public class Widget extends HelpHandler {


    public Widget(final HelpHandler next) {
        super(next);
    }

    @Override
    protected boolean help(final String helpContext) {
        System.out.println("Widget help");
        return this.nextHelp(helpContext);
    }
}
