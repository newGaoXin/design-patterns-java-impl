package heaver.iterator;

/**
 * 迭代器接口
 *
 * @author newgaoxin
 * @date 2024/5/25 19:48
 */
public interface Iterator<E> {

    E first();

    E next();

    boolean hasNext();
}
