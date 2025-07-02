// Q6)Demonstrate the use of addFirst(), addLast, removeFirst(), removeLast, getFirst(), getLast(), reversed() in Set and List Sequenced collections

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("A");
        list.addLast("B");
        list.addFirst("C");
        list.addLast("D");

        System.out.println("List after addFirst/addLast: " + list);
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println("List after removeFirst/removeLast: " + list);

        List<String> reversedList = list.reversed();
        System.out.println("Reversed List: " + reversedList);

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");

        System.out.println("\nSet: " + set);
        System.out.println("First Element: " + set.getFirst());
        System.out.println("Last Element: " + set.getLast());

        SequencedSet<String> reversedSet = set.reversed();
        System.out.println("Reversed Set: " + reversedSet);

    }
}

