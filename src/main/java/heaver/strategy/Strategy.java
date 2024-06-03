package heaver.strategy;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/6/3 21:55
 */
public abstract class Strategy {

    protected abstract boolean support(final StrategyType type);

    protected abstract void doExecute();

    public void execute(final StrategyType type) {
        if (this.support(type)) {
            this.doExecute();
        }
    }
}
