package heaver.mediator;

/**
 * ListBox
 *
 * @author newgaoxin
 * @date 2024/5/26 22:15
 */
public class Button extends Widget {

    private final String name;

    public Button(final String name, DialogDirector dialogDirector) {
        super(dialogDirector);
        this.name = name;
    }

    @Override
    public void handleMouse() {
        this.changed();
    }

    protected String getName() {
        return name;
    }
}
