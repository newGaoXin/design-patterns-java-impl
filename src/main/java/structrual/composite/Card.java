package structrual.composite;

import java.math.BigDecimal;

/**
 * 显卡
 *
 * @author newgaoxin
 * @date 2024/3/1 22:11
 */
public class Card extends CompositeEquipment {

    protected Card(final String name) {
        super(name);
    }

    @Override
    public int power() {
        return 3;
    }

    @Override
    public BigDecimal discountPrice() {
        return BigDecimal.valueOf(100);
    }
}
