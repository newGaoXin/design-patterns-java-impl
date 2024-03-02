package structrual.composite;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Objects;

/**
 * 设备
 *
 * @author newgaoxin
 * @date 2024/3/1 21:29
 */
public abstract class Equipment
//        implements Iterable<Equipment>
{

    /**
     * 名称
     */
    private final String name;

    protected Equipment(final String name) {
        this.name = name;
    }

    /**
     * 电压
     *
     * @return
     */
    public abstract int power();

    public abstract BigDecimal netPrice();

    public abstract BigDecimal discountPrice();

    public abstract void add(Equipment e);

    public abstract void remove(Equipment e);

//    @Override
//    public Iterator<Equipment> iterator() {
//        return new EquipmentIte(this);
//    }

    private static class EquipmentIte implements Iterator<Equipment> {

        private Equipment equipment;

        public EquipmentIte(final Equipment equipment) {
            this.equipment = equipment;
        }

        @Override
        public boolean hasNext() {
            return Objects.nonNull(equipment);
        }

        @Override
        public Equipment next() {
            return this.equipment;
        }
    }
}
