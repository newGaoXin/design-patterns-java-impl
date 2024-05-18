package heaver.chainrepository;

/**
 * HelpHandler
 *
 * @author newgaoxin
 * @date 2024/3/9 21:42
 */
public abstract class HelpHandler {

    private final HelpHandler next;

    public HelpHandler(final HelpHandler next) {
        this.next = next;
    }

    public HelpHandler getNext() {
        return next;
    }

    protected abstract boolean help(final String helpContext);

    public boolean nextHelp(String helpContext) {
        if (next == null) {
            return Boolean.TRUE;
        }
        return this.next.help(helpContext);
    }


}
