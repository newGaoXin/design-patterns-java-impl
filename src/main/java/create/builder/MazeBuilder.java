package create.builder;

import create.defualt.Maze;

/**
 * 迷宫建造者-抽象类
 *
 * @author 高鑫
 * @date 2024/2/24 16:19
 */
public abstract class MazeBuilder {

    protected Maze maze;

    public void builderMaze() {
        maze = new Maze();
    }

    public abstract void builderRoom(int num);

    public abstract void builderDoor(int roomNum1, int roomNum2);

    protected Maze getMaze() {
        return this.maze;
    }
}
