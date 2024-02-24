package create.prototype;

import create.game.Maze;

/**
 * 迷宫游戏
 *
 * @author 高鑫
 * @date 2024/2/24 20:01
 */
public class MazeGame {

    public Maze createMaze(MazeFactory mazeFactory) {
        final Maze maze = mazeFactory.makeMaze();

        // ...

        return maze;
    }
}
