package create.prototype;

import create.game.Door;
import create.game.Maze;
import create.game.Room;
import create.game.Wall;

/**
 * 迷宫原型工厂
 *
 * @author 高鑫
 * @date 2024/2/24 19:47
 */
public class MazePrototypeFactory extends MazeFactory {


    public MazePrototypeFactory(final Maze maze, final Room room,
                                final PrototypeDoor door, final PrototypeWall wall) {
        super(maze, room, door, wall);
    }

    @Override
    public Room makeRoom(final int num) {
        return new Room(num);
    }

    @Override
    public Door makeDoor(final Room room1, final Room room2) {
        final PrototypeDoor prototypeDoor = (PrototypeDoor) super.door;
        prototypeDoor.init(room1, room2);
        return prototypeDoor;
    }

    @Override
    public Wall makeWall() {
        final PrototypeWall prototypeWall = (PrototypeWall) super.wall;
        return prototypeWall.clone();
    }


}
