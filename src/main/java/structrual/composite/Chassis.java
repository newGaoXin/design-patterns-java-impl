package structrual.composite;

import java.math.BigDecimal;

/**
 * 底盘
 *
 * @author newgaoxin
 * @date 2024/3/1 21:54
 */
public class Chassis extends CompositeEquipment {

    public Chassis(final String name) {
        super(name);
    }

    @Override
    public int power() {
        return 4;
    }

    @Override
    public BigDecimal discountPrice() {
        return new BigDecimal("3");
    }

}
