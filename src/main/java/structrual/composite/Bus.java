package structrual.composite;

import java.math.BigDecimal;

/**
 * 总线
 *
 * @author newgaoxin
 * @date 2024/3/1 22:08
 */
public class Bus extends CompositeEquipment {

    protected Bus(final String name) {
        super(name);
    }

    @Override
    public int power() {
        return 1;
    }

    @Override
    public BigDecimal discountPrice() {
        return BigDecimal.ONE;
    }
}
