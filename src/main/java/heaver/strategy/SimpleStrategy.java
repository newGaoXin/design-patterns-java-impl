package heaver.strategy;

/**
 * simple 策略
 *
 * @author newgaoxin
 * @date 2024/6/3 21:58
 */
public class SimpleStrategy extends Strategy {

    @Override
    protected boolean support(final StrategyType type) {
        return StrategyType.SIMPLE.equals(type);
    }

    @Override
    protected void doExecute() {
        System.out.println("simple strategy execute ... ");
    }
}
