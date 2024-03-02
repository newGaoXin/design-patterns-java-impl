package structrual.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/3/1 21:49
 */
public abstract class CompositeEquipment extends Equipment {

    private List<Equipment> equipmentList;

    protected CompositeEquipment(final String name) {
        super(name);
        this.equipmentList = new ArrayList<>();
    }

    @Override
    public BigDecimal netPrice() {
        BigDecimal price = this.discountPrice();

        for (final Equipment equipment : this.equipmentList) {
            price = price.add(equipment.netPrice());
        }
        return price;
    }

    @Override
    public void add(final Equipment e) {
        this.equipmentList.add(e);
    }

    @Override
    public void remove(final Equipment e) {
        this.remove(e);
    }
}
