package create.singleton;

import create.game.Maze;

/**
 * 迷宫游戏
 *
 * @author 高鑫
 * @date 2024/2/24 16:22
 */
public class MazeGame {

    public Maze createMaze(MazeFactory mazeFactory) {
        final Maze maze = mazeFactory.makeMaze();

        // ...

        return maze;
    }
}
