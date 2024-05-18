package heaver.chainrepository;

/**
 * Button
 *
 * @author newgaoxin
 * @date 2024/3/9 21:59
 */
public class Button extends HelpHandler {

    public Button(final HelpHandler next) {
        super(next);
    }

    @Override
    protected boolean help(final String helpContext) {
        System.out.println("Button help");
        return this.nextHelp(helpContext);
    }
}
