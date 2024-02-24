package create.builder;

import create.game.Room;
import create.game.Wall;

/**
 * todo
 *
 * @author 高鑫
 * @date 2024/2/24 16:34
 */
public class CommonWall extends Wall {

    private Room r1;

    private Room r2;

    public CommonWall(final Room r1, final Room r2) {
        this.r1 = r1;
        this.r2 = r2;
    }
}
