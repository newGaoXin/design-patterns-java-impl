package create.defualt;

import java.util.HashMap;
import java.util.Map;

/**
 * 迷宫
 *
 * @author 高鑫
 * @date 2024/2/24 15:33
 */
public class Maze {

    public final Map<Integer, Room> roomMap = new HashMap<>();

    public void addRoom(Room room) {
        this.roomMap.put(room.getRoomNum(), room);
    }

    public Room roomNum(int roomNum) {
        return roomMap.get(roomNum);
    }

}
