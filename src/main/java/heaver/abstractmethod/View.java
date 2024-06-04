package heaver.abstractmethod;

/**
 * view
 *
 * @author newgaoxin
 * @date 2024/6/4 20:58
 */
public abstract class View {

    public void display() {
        this.setFocus();
        this.doDisplay();
        this.resetFocus();
    }

    public void setFocus() {
        System.out.println("Set Focus...");
    }

    public abstract void doDisplay();

    public void resetFocus() {
        System.out.println("reset focus...");
    }
}
