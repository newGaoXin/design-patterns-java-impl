package create.fatorymethod;

import create.game.Door;
import create.game.Room;
import create.game.enchanted.EnchantedDoor;
import create.game.enchanted.EnchantedRoom;

/**
 * 施了魔法的迷宫游戏
 *
 * @author 高鑫
 * @date 2024/2/24 19:27
 */
public class EnchantedMazeGame extends MazeGame {

    @Override
    public Room makeRoom(final int num) {
        return new EnchantedRoom(num);
    }

    @Override
    public Door makeDoor(final Room room1, final Room room2) {
        return new EnchantedDoor(room1, room2);
    }
}
