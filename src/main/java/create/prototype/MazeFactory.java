package create.prototype;

import create.game.Door;
import create.game.Maze;
import create.game.Room;
import create.game.Wall;

/**
 * 迷宫工厂
 *
 * @author 高鑫
 * @date 2024/2/24 19:45
 */
public abstract class MazeFactory {

    protected Maze maze;

    protected Room room;

    protected Door door;

    protected Wall wall;

    public MazeFactory(final Maze maze, final Room room, final Door door, final Wall wall) {
        this.maze = maze;
        this.room = room;
        this.door = door;
        this.wall = wall;
    }

    public Maze makeMaze() {
        return new Maze();
    }

    public abstract Room makeRoom(int num);

    public abstract Door makeDoor(Room room1, Room room2);

    public abstract Wall makeWall();
}
