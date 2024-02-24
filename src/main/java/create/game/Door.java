package create.game;

/**
 * 门
 *
 * @author 高鑫
 * @date 2024/2/24 15:28
 */
public class Door implements MapSite {

    private final Room room1;

    private final Room room2;

    public Door(final Room room1, final Room room2) {
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
