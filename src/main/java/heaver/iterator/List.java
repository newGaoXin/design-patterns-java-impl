package heaver.iterator;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/5/25 19:44
 */
public class List<E> extends AbstractList<E> {

    private Object[] array;
    private int szie;

    public List(int size) {
        this.array = new Object[size];
    }

    public E get(int index) {
        return (E) array[index];
    }

    public int size() {
        return szie;
    }


    public void add(final E e) {
        this.array[szie++] = e;
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator<>(this);
    }

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
}
