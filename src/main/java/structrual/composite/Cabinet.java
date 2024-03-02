package structrual.composite;

import java.math.BigDecimal;

/**
 * 柜
 *
 * @author newgaoxin
 * @date 2024/3/1 22:07
 */
public class Cabinet extends CompositeEquipment {

    protected Cabinet(final String name) {
        super(name);
    }

    @Override
    public int power() {
        return 2;
    }

    @Override
    public BigDecimal discountPrice() {
        return BigDecimal.TEN;
    }
}
