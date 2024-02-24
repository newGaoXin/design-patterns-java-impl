package create.prototype;

import create.game.Maze;
import create.game.Room;

/**
 * 游戏 init
 *
 * @author 高鑫
 * @date 2024/2/24 20:01
 */
public class GameInit {

    public static void main(String[] args) {
        final MazeGame mazeGame = new MazeGame();

        final MazePrototypeFactory simpleMazeFactory = new MazePrototypeFactory(
                new Maze(), new Room(), new PrototypeDoor(), new PrototypeWall()
        );
        final Maze maze = mazeGame.createMaze(simpleMazeFactory);
    }
}
