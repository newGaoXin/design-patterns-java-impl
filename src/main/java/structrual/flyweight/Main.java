package structrual.flyweight;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/3/5 21:18
 */
public class Main {

    public static void main(String[] args) {
        final GlyphFactory glyphFactory = new GlyphFactory();
        final Row row = glyphFactory.createRow();
        row.add(glyphFactory.createCharacter('c'));
        row.add(glyphFactory.createCharacter('b'));
        row.add(glyphFactory.createCharacter('c'));
    }
}
