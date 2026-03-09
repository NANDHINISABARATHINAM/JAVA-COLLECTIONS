import java.util.*;
import java.util.LinkedList;

public class Linkhashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> l=new LinkedHashSet<>();
        l.add(20);
        l.add(10);
        l.add(40);
        l.add(30);
        l.add(20);
        System.out.println(l);
    }
}
