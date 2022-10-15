import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class HashTreeSet {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>(20,0.75f);

        hash.add(10);
        hash.add(20);
        hash.add(30);
        hash.add(10);

        System.out.print("Hash Set: ");
        System.out.println(hash);

        TreeSet<Integer> ts=new TreeSet<>(List.of(10,30,50,70,10,40));

        ts.add(25);

        System.out.print("Tree Set: ");
        System.out.println(ts);
    }
}
