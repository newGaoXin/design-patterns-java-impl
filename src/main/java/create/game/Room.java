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
    private int roomNum;

    /**
     * 方位
     */
    private HashMap<Direction, MapSite> directionMapSite;

    public Room() {
        this.directionMapSite = new HashMap<>();
    }

    public Room(final int roomNum) {
        this.roomNum = roomNum;
        this.directionMapSite = new HashMap<>();
    }

    public void init(int roomNum) {
        this.roomNum = roomNum;
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
