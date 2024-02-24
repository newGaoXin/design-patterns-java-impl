package create.game;

/**
 * 门
 *
 * @author 高鑫
 * @date 2024/2/24 15:28
 */
public class Door implements MapSite {

    protected Room room1;

    protected Room room2;

    public Door() {
    }

    public Door(final Room room1, final Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    public void init(final Room room1, final Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    @Override
    public void enter() {

    }

    /**
     * 开门
     */
    public void isOpen() {

    }
}
