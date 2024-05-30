package heaver.memento;

/**
 * 备忘录模式 demo
 *
 * @author newgaoxin
 * @date 2024/5/30 21:07
 */
public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {
        final Runner runner = new Runner();

        final ForwardCommand forwardCommand = new ForwardCommand(10);
        runner.execute(forwardCommand);

        System.out.println(" run forward distance : " + runner.getRunDistance());

        final BackCommand backCommand = new BackCommand(5);
        runner.execute(backCommand);

        System.out.println(" run back distance : " + runner.getRunDistance());

        runner.undo();

        System.out.println(" run undo distance : " + runner.getRunDistance());
    }
}
