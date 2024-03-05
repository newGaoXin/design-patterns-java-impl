package structrual.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/3/4 21:55
 */
public class Row {


    private List<Glyph> glyphs;

    public Row() {
        glyphs = new ArrayList<>();
    }

    public void add(Glyph glyph) {
        this.glyphs.add(glyph);
    }

    public void remove(Glyph glyph) {
        this.glyphs.remove(glyph);
    }
}
