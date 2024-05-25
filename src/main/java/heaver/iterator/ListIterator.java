package heaver.iterator;


/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/5/25 19:56
 */
public class ListIterator<E> implements Iterator<E> {

    private final List<E> list;

    private int current;

    public ListIterator(final List<E> list) {
        this.list = list;
        current = 0;
    }

    @Override
    public E first() {
        return list.get(0);
    }

    @Override
    public E next() {
        final E e = list.get(current);
        current++;
        return e;
    }

    @Override
    public boolean hasNext() {
        return current < list.size();
    }
}
