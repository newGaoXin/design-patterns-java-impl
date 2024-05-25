package heaver.iterator;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/5/25 20:24
 */
public abstract class AbstractList<E> {

    public abstract E get(int index);

    public abstract int size();

    public abstract void add(final E e);

    public abstract Iterator iterator();
}
