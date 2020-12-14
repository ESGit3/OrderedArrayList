import java.util.*;

public class Tester {
    public static void main(String[] args) {
        NoNullArrayList<Integer> test = new NoNullArrayList<Integer>();
        test.add(0, 3);
        System.out.println(test.set(0, 2));

        OrderedArrayList<Integer> temp = new OrderedArrayList<Integer>();
        temp.add(4);
        temp.add(2);
        temp.add(6);
        temp.add(0);
        temp.add(-3);
        System.out.println(temp.toString());
    }
}