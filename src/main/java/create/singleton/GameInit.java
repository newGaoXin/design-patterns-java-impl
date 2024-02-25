package create.singleton;

import create.game.Maze;

/**
 * 游戏初始化
 *
 * @author newgaoxin
 * @date 2024/2/25 14:00
 */
public class GameInit {

    public static void main(String[] args) {
        final MazeFactory mazeFactory = MazeFactory.getInstance();
        final MazeGame mazeGame = new MazeGame();
        final Maze maze = mazeGame.createMaze(mazeFactory);
    }
}
