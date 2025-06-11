package top.wmd001.behavioral.iterator;

import java.util.Iterator;

public class ReverseArrayCollection<T> implements Iterable<T> {

    private final T[] array;

    public ReverseArrayCollection(T[] array) {
        this.array = array;
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }


    class ReverseArrayIterator implements Iterator<T> {

        private int index;

        public ReverseArrayIterator() {
            this.index = array.length;
        }

        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public T next() {
            index--;
            return array[index];
        }
    }

}
