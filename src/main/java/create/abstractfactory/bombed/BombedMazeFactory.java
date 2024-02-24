package create.abstractfactory.bombed;

import create.abstractfactory.MazeFactory;
import create.defualt.Room;
import create.defualt.Wall;

/**
 * 炸弹迷宫工厂
 *
 * @author 高鑫
 * @date 2024/2/24 16:07
 */
public class BombedMazeFactory extends MazeFactory {

    @Override
    public Wall makeWall() {
        return new BombedWall();
    }

    @Override
    public Room makeRoom(final int num) {
        return new RoomWithABomb(num);
    }
}
