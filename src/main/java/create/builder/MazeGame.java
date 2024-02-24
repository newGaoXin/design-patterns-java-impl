package create.builder;

import create.game.Maze;

/**
 * 迷宫游戏
 *
 * @author 高鑫
 * @date 2024/2/24 16:22
 */
public class MazeGame {

    public Maze createMaze(MazeBuilder builder) {
        builder.builderMaze();

        builder.builderRoom(1);
        builder.builderRoom(2);
        builder.builderDoor(1, 2);

        return builder.getMaze();
    }
}
