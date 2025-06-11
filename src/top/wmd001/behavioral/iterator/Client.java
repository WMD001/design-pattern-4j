package top.wmd001.behavioral.iterator;

import java.util.Iterator;

public class Client {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        ReverseArrayCollection<Integer> collection = new ReverseArrayCollection<>(array);
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }

}
