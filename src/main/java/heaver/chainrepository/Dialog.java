package heaver.chainrepository;

/**
 * Dialog
 *
 * @author newgaoxin
 * @date 2024/3/9 22:00
 */
public class Dialog extends HelpHandler {


    public Dialog(final HelpHandler next) {
        super(next);
    }

    @Override
    protected boolean help(final String helpContext) {
        System.out.println("Dialog help");
        return this.nextHelp(helpContext);
    }
}
