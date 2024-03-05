package structrual.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/3/4 21:55
 */
public class GlyphFactory {

    private Map<java.lang.Character, Character> characters = new HashMap<>();

    public Character createCharacter(char c) {
        Character character = characters.get(java.lang.Character.valueOf(c));
        if (Objects.isNull(character)) {
            character = new Character(c);
        }

        return character;
    }

    public Row createRow() {
        return new Row();
    }

}
