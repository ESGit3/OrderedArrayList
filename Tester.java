import java.util.*;

public class Tester {
    public static void main(String[] args) {
        NoNullArrayList<Integer> test = new NoNullArrayList<Integer>();
        test.add(0, 3);
        System.out.println(test.set(0, null));
    }
}