import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListFramwork {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(20);

        ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));

        al1.add(10);
        al1.add(0, 5);
        al1.addAll(1,al2);

        System.out.println(al1.contains(30));
        System.out.println(al1.get(5));
        System.out.println(al1.indexOf(70));
        System.out.println(al1.lastIndexOf(70));
        System.out.println(al1.set(6, 100));
        System.out.println(al1);

        /* --------Iteration through ArrayList---------------------*/

        for (int i = 0; i < al1.size(); i++) {
            System.out.println(al1.get(i));
        }

        for (Integer x : al1) {
            System.out.println(x);
        }

        for (Integer x : al1) {
            System.out.println(x);
        }
    }
}
