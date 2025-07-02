// Q7)Demonstrate the use of firstEntry(), lastEntry(), pollFirstEntry(), pollLastEntry(), putFirst(), putLast(), reversed() with SequencedMap.import java.util.*;

public class Main {
    public static void main(String[] args) {
        SequencedMap<String, Integer> map = new LinkedHashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        map.putFirst("Zero", 0);      
        map.putLast("Four", 4);       

        System.out.println("Map after putFirst and putLast:");
        System.out.println(map);

        Map.Entry<String, Integer> first = map.firstEntry();
        Map.Entry<String, Integer> last = map.lastEntry();

        System.out.println("\nFirst Entry: " + first);
        System.out.println("Last Entry: " + last);     

        Map.Entry<String, Integer> removedFirst = map.pollFirstEntry();
        Map.Entry<String, Integer> removedLast = map.pollLastEntry();

        System.out.println("\nPolled First Entry: " + removedFirst);
        System.out.println("Polled Last Entry: " + removedLast);

        System.out.println("\nMap after polling:");
        System.out.println(map);

        Map<String, Integer> reversed = map.reversed();
        System.out.println("\nReversed Map:");
        System.out.println(reversed);
    }
}
