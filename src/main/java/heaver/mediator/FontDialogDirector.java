package heaver.mediator;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/5/26 22:18
 */
public class FontDialogDirector extends DialogDirector {

    private Button ok;


    public FontDialogDirector() {
    }

    @Override
    public void showDialog() {

    }

    @Override
    public void widgetChanged(final Widget widget) {
        System.out.println(widget.getClass().getSimpleName() + " change ... ");
    }

    @Override
    public void createWidgets() {
        this.ok = new Button("ok", this);
    }


    public void clickOk() {
        this.ok.handleMouse();
    }
}
