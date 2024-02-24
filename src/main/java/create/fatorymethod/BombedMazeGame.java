package create.fatorymethod;

import create.game.Room;
import create.game.Wall;
import create.game.bomded.BombedWall;
import create.game.bomded.RoomWithABomb;

/**
 * 爆炸迷宫游戏
 *
 * @author 高鑫
 * @date 2024/2/24 19:22
 */
public class BombedMazeGame extends MazeGame {

    @Override
    public Room makeRoom(final int num) {
        return new RoomWithABomb(num);
    }

    @Override
    public Wall makeWall() {
        return new BombedWall();
    }
}
