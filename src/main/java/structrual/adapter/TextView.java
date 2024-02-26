package structrual.adapter;

/**
 * 文本视图
 *
 * @author newgaoxin
 * @date 2024/2/25 15:54
 */
public class TextView {

    /**
     * 获取起点 x
     */
    private final int originX;

    /**
     * 获取起点 y
     */
    private final int originy;

    /**
     * 获取范围 width
     */
    private final int extentWidth;

    /**
     * 获取范围 height
     */
    private final int extentHeight;

    public TextView(final int originX, final int originy, final int extentWidth, final int extentHeight) {
        this.originX = originX;
        this.originy = originy;
        this.extentWidth = extentWidth;
        this.extentHeight = extentHeight;
    }

    public boolean isEmpty() {
        return this.originX == 0 && this.originy == 0 && this.extentHeight == 0 && this.extentWidth == 0;
    }

    public int getOriginX() {
        return originX;
    }

    public int getOriginy() {
        return originy;
    }

    public int getExtentWidth() {
        return extentWidth;
    }

    public int getExtentHeight() {
        return extentHeight;
    }
}
