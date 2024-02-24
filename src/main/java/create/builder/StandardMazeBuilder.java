package create.builder;

import create.game.Direction;
import create.game.Door;
import create.game.Room;
import create.game.Wall;

/**
 * todo
 *
 * @author 高鑫
 * @date 2024/2/24 16:29
 */
public class StandardMazeBuilder extends MazeBuilder {


    @Override
    public void builderRoom(final int num) {
        final Room room = new Room(num);

        room.setSite(Direction.EAST, new Wall());
        room.setSite(Direction.NORTH, new Wall());
        room.setSite(Direction.WEST, new Wall());
        room.setSite(Direction.SOUTH, new Wall());

        super.maze.addRoom(room);
    }

    @Override
    public void builderDoor(final int roomNum1, final int roomNum2) {
        final Room room1 = super.maze.roomNum(roomNum1);
        final Room room2 = super.maze.roomNum(roomNum2);

        final Door door = new Door(room1, room2);

        room1.setSite(new CommonWall(room1, room2), door);
        room2.setSite(new CommonWall(room1, room2), door);
    }
}
