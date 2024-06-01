package heaver.observer;

import java.time.Clock;
import java.time.LocalDateTime;

/**
 * 时钟
 *
 * @author newgaoxin
 * @date 2024/6/1 20:41
 */
public class ClockTimer extends Subject {

    private final Clock clock = Clock.systemDefaultZone();

    public int getHour() {
        final LocalDateTime now = LocalDateTime.now();
        return now.getHour();
    }

    public int getMinute() {
        final LocalDateTime now = LocalDateTime.now();
        return now.getMinute();
    }

    public int getSecond() {
        final LocalDateTime now = LocalDateTime.now();
        return now.getMinute();
    }
}
