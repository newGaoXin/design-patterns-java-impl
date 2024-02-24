package create.abstractfactory;

import create.abstractfactory.bombed.BombedMazeFactory;

/**
 * GameInit
 *
 * @author 高鑫
 * @date 2024/2/24 16:11
 */
public class GameInit {

    public static void main(String[] args) {
        // 使用工厂模式创建爆炸迷宫
        final MazeGame mazeGame = new MazeGame();
        mazeGame.createMaze(new BombedMazeFactory());
    }
}
