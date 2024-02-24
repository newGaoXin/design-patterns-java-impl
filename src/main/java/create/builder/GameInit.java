package create.builder;

import create.defualt.Maze;

/**
 * 使用 builder 模式创建迷宫游戏
 *
 * @author 高鑫
 * @date 2024/2/24 16:37
 */
public class GameInit {

    public static void main(String[] args) {
        final MazeBuilder standardMazeBuilder = new StandardMazeBuilder();
        final MazeGame mazeGame = new CreateComplexGame();

        mazeGame.createMaze(standardMazeBuilder);
        final Maze maze = standardMazeBuilder.getMaze();
    }
}
