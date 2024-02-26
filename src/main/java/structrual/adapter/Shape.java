package structrual.adapter;

/**
 * 图形
 *
 * @author newgaoxin
 * @date 2024/2/25 15:46
 */
public class Shape {

    /**
     * 边界框
     */
    public void boundingBox(int bottomLeft, int topRight) {

    }

    /**
     * 创建 操纵者
     */
    public Manipulator createManipulator() {
        return new Manipulator();
    }
}
