package create.builder;

import create.defualt.Maze;

/**
 * 创建一个复杂迷宫
 *
 * @author 高鑫
 * @date 2024/2/24 16:27
 */
public class CreateComplexGame extends MazeGame {

    @Override
    public Maze createMaze(final MazeBuilder builder) {
        builder.builderMaze();

        builder.builderRoom(1);

        builder.builderRoom(10001);
        return builder.getMaze();
    }
}
