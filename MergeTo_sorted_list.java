import java.util.Collections;
import java.util.LinkedList;

public class MergeTo_sorted_list {
    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        // System.out.println(list1);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(4);
        list2.add(5);
        // System.out.println(list2);

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.addAll(list1);
        list3.addAll(list2);

        Collections.sort(list3);
        System.out.print(list3);

    }
}
