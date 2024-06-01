package heaver.observer;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/6/1 20:43
 */
public class LogClock implements Observer {

    @Override
    public void update(final Subject subject) {
        if (subject instanceof final ClockTimer subjectClockTime) {
            System.out.println(subjectClockTime.getHour() + ": " + subjectClockTime.getMinute() + " : " + subjectClockTime.getSecond());
        }
    }
}
