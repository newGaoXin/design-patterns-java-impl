package create.abstractfactory.enchanted;

import create.defualt.Door;
import create.defualt.Room;

/**
 * 施了魔法的门
 *
 * @author 高鑫
 * @date 2024/2/24 16:05
 */
public class EnchantedDoor extends Door {
    public EnchantedDoor(final Room room1, final Room room2) {
        super(room1, room2);
    }
}
