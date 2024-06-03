package heaver.strategy;

/**
 * TeX 策略
 *
 * @author newgaoxin
 * @date 2024/6/3 22:00
 */
public class TeXStrategy extends Strategy {

    @Override
    protected boolean support(final StrategyType type) {
        return StrategyType.TEX.equals(type);
    }

    @Override
    protected void doExecute() {

    }
}
