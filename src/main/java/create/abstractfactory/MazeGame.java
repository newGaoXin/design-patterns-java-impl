package create.abstractfactory;

import create.defualt.Direction;
import create.defualt.Door;
import create.defualt.Maze;
import create.defualt.Room;

/**
 * 使用 MazeFactory 抽象工厂设计模式实现的  MazeGame
 *
 * @author 高鑫
 * @date 2024/2/24 15:57
 */
public class MazeGame {

    public Maze createMaze(MazeFactory mazeFactory) {
        final Maze maze = mazeFactory.makeMaze();
        final Room room1 = mazeFactory.makeRoom(1);
        final Room room2 = mazeFactory.makeRoom(2);
        final Door door = mazeFactory.makeDoor(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSite(Direction.EAST, mazeFactory.makeWall());
        room1.setSite(Direction.NORTH, mazeFactory.makeWall());
        room1.setSite(Direction.WEST, door);
        room1.setSite(Direction.SOUTH, mazeFactory.makeWall());

        room2.setSite(Direction.EAST, mazeFactory.makeWall());
        room2.setSite(Direction.NORTH, mazeFactory.makeWall());
        room2.setSite(Direction.WEST, mazeFactory.makeWall());
        room2.setSite(Direction.SOUTH, door);

        return maze;
    }
}
