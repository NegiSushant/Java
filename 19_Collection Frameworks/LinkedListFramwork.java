import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListFramwork {
    public static void main(String[] args) {
        LinkedList<Integer> li1 = new LinkedList<>();

        LinkedList<Integer> li2 = new LinkedList<>(List.of(10, 13, 12, 18, 27));

        li1.add(9);
        li1.add(0, 25);
        li1.addAll(1, li2);
        li1.set(6, 50);
        li1.addFirst(98);
        li1.addLast(200);
        li1.forEach(n->show(n));

    }
    public static void show(int n){
        System.out.println(n);
    }
}
