package heaver.iterator;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/5/25 20:01
 */
public class PrintEmployees {

    public static void print(Iterator iterator) {

        while (iterator.hasNext()) {
            final Object next = iterator.next();
            System.out.println(next);
        }
    }
}
