package create.defualt;

/**
 * 迷宫游戏
 *
 * @author 高鑫
 * @date 2024/2/24 15:37
 */
public class MazeGame {

    public Maze createMaze() {
        final Maze maze = new Maze();
        final Room room1 = new Room(1);
        final Room room2 = new Room(2);
        final Door door = new Door(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSite(Direction.EAST, new Wall());
        room1.setSite(Direction.NORTH, new Wall());
        room1.setSite(Direction.WEST, door);
        room1.setSite(Direction.SOUTH, new Wall());

        room2.setSite(Direction.EAST, new Wall());
        room2.setSite(Direction.NORTH, new Wall());
        room2.setSite(Direction.WEST, new Wall());
        room2.setSite(Direction.SOUTH, door);

        return maze;
    }
}
