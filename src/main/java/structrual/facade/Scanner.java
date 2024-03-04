package structrual.facade;

import java.io.InputStream;
import java.util.UUID;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/3/4 20:08
 */
public class Scanner {

    private InputStream inputStream;

    public Scanner(final InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String scan() {
        return UUID.randomUUID().toString();
    }
}
