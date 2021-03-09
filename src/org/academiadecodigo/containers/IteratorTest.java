package org.academiadecodigo.containers;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorTest {

    public static void main(String[] args) {

       // LinkedList<Integer> list = new LinkedList<>();

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(30);
        list.add(15);

        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("=============================");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("=============================");

        int less = list.stream()
                .filter(i -> i % 5 == 0)// sem for mas ok maior 98
                .map(i -> i + 3) //so somei o valor pra ver se testar o map
                .reduce(0, (a,b) -> a + b);
        System.out.println(less);

    }
}
