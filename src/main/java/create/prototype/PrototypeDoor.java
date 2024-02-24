package create.prototype;

import create.game.Door;

/**
 * 原型 door
 *
 * @author 高鑫
 * @date 2024/2/24 19:55
 */
public class PrototypeDoor extends Door implements Cloneable {

    public PrototypeDoor() {
    }

    public PrototypeDoor(final PrototypeDoor prototypeDoor) {
        super(prototypeDoor.room1, prototypeDoor.room2);
    }

    @Override
    public PrototypeDoor clone() {
        return new PrototypeDoor(this);
    }
}
