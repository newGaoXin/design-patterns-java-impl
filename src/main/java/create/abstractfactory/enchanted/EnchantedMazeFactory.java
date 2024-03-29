package create.abstractfactory.enchanted;

import create.abstractfactory.MazeFactory;
import create.game.Door;
import create.game.Room;
import create.game.enchanted.EnchantedDoor;
import create.game.enchanted.EnchantedRoom;

/**
 * 创建施了魔法的迷宫
 *
 * @author 高鑫
 * @date 2024/2/24 16:02
 */
public class EnchantedMazeFactory extends MazeFactory {

    @Override
    public Room makeRoom(final int num) {
        return new EnchantedRoom(num);
    }

    @Override
    public Door makeDoor(final Room room1, final Room room2) {
        return new EnchantedDoor(room1, room2);
    }
}
