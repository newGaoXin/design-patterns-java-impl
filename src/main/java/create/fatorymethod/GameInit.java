package create.fatorymethod;

/**
 * 游戏初始化
 *
 * @author 高鑫
 * @date 2024/2/24 19:29
 */
public class GameInit {

    public static void main(String[] args) {
        final BombedMazeGame bombedMazeGame = new BombedMazeGame();
        bombedMazeGame.createMaze();
    }
}
