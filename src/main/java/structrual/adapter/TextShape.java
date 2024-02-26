package structrual.adapter;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/2/25 16:01
 */
public class TextShape extends Shape {

    private TextView textView;

    public TextShape(final TextView textView) {
        this.textView = textView;
    }


    @Override
    public void boundingBox(int bottomLeft, int topRight) {
        int bottom = this.textView.getOriginX();
        int left = this.textView.getOriginy();
        int width = this.textView.getExtentWidth();
        int height = this.textView.getExtentHeight();

        // ...
//        bottomLeft = this.point(bottom, left);
//        topRight = this.point(bottom.increment(height), left.increment(width));
    }

    @Override
    public TextManipulator createManipulator() {
        return new TextManipulator();
    }


    /**
     * 获取起点
     */
    public int getOriginX() {
        return this.textView.getOriginX();
    }

    /**
     * 获取起点
     */
    public int getOriginY() {
        return this.textView.getOriginy();
    }

    /**
     * 获取范围 width
     */
    public int getExtentWidth() {
        return this.textView.getExtentWidth();
    }

    /**
     * 获取范围 height
     */
    public int getExtentHeight() {
        return this.textView.getExtentHeight();
    }

    public void isEmpty() {
        this.textView.isEmpty();
    }

}
