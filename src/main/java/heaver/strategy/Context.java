package heaver.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * 策略上下文
 *
 * @author newgaoxin
 * @date 2024/6/3 21:52
 */
public class Context {

    private List<Strategy> strategies = new ArrayList<>();

    public Context(final List<Strategy> strategies) {
        this.strategies = strategies;
    }

    public void execute(StrategyType type) {
        for (Strategy strategy : strategies) {
            strategy.execute(type);
        }
    }
}
