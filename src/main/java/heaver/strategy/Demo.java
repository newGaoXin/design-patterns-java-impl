package heaver.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * 策略模式 demo
 *
 * @author newgaoxin
 * @date 2024/6/3 21:52
 */
public class Demo {

    public static void main(String[] args) {
        List<Strategy> strategies = new ArrayList<>();
        strategies.add(new SimpleStrategy());
        strategies.add(new TeXStrategy());
        final Context context = new Context(strategies);
        context.execute(StrategyType.SIMPLE);
    }
}
