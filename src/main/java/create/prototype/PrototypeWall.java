package create.prototype;

import create.game.Wall;

/**
 * 原型 wall
 *
 * @author newgaoxin
 * @date 2024/2/24 19:50
 */
public class PrototypeWall extends Wall implements Cloneable {
    @Override
    public PrototypeWall clone() {
        return this;
    }
}
