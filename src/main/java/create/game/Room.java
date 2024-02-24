package create.game;

import create.builder.CommonWall;

import java.util.HashMap;

/**
 * 房间
 *
 * @author 高鑫
 * @date 2024/2/24 15:27
 */
public class Room implements MapSite {

    /**
     * 房间号
     */
    private final int roomNum;

    /**
     * 方位
     */
    private final HashMap<Direction, MapSite> directionMapSite;

    public Room(final int roomNum) {
        this.roomNum = roomNum;
        this.directionMapSite = new HashMap<>();
    }

    @Override
    public void enter() {

    }

    public void setSite(CommonWall direction, MapSite mapSite) {
//        this.directionMapSite.put(direction, mapSite);
    }

    public void setSite(Direction direction, MapSite mapSite) {
        this.directionMapSite.put(direction, mapSite);
    }

    public MapSite getSize(Direction direction) {
        return this.directionMapSite.get(direction);
    }

    public int getRoomNum() {
        return roomNum;
    }
}
