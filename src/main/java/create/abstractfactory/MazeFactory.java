package create.abstractfactory;

import create.defualt.Door;
import create.defualt.Maze;
import create.defualt.Room;
import create.defualt.Wall;

/**
 * 迷宫工厂
 *
 * @author 高鑫
 * @date 2024/2/24 15:22
 */
public class MazeFactory {

    public Maze makeMaze() {
        return new Maze();
    }

    public Room makeRoom(int num) {
        return new Room(num);
    }

    public Door makeDoor(Room room1, Room room2) {
        return new Door(room1, room2);
    }

    public Wall makeWall() {
        return new Wall();
    }
}
