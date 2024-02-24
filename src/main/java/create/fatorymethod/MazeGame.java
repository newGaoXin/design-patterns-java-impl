package create.fatorymethod;

import create.game.*;

/**
 * 迷宫游戏
 *
 * @author 高鑫
 * @date 2024/2/24 19:14
 */
public abstract class MazeGame {

    public Maze createMaze() {
        final Maze maze = this.makeMaze();
        final Room room1 = this.makeRoom(1);
        final Room room2 = this.makeRoom(2);
        final Door door = makeDoor(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSite(Direction.EAST, this.makeWall());
        room1.setSite(Direction.NORTH, this.makeWall());
        room1.setSite(Direction.WEST, door);
        room1.setSite(Direction.SOUTH, this.makeWall());

        room2.setSite(Direction.EAST, this.makeWall());
        room2.setSite(Direction.NORTH, this.makeWall());
        room2.setSite(Direction.WEST, this.makeWall());
        room2.setSite(Direction.SOUTH, door);

        return maze;
    }

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
