package create.singleton;

import create.game.Maze;

/**
 * 单例设计模式的 迷宫工厂
 *
 * @author newgaoxin
 * @date 2024/2/25 13:58
 */
public class MazeFactory {

    private static MazeFactory mazeFactory;

    private MazeFactory() {

    }

    public static MazeFactory getInstance() {
        if (mazeFactory == null) {
            mazeFactory = new MazeFactory();
        }

        return mazeFactory;
    }

    public Maze makeMaze() {
        return new Maze();
    }
}
