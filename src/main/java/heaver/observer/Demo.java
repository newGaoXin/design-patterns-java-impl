package heaver.observer;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/6/1 20:28
 */
public class Demo {

    public static void main(String[] args) {
        final Subject subject = new ClockTimer();
        subject.add(new LogClock());

        subject.notifyObserver();
    }
}
