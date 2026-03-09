import java.util.*;
public class Hashsetinterface {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.add(20);
        h.add(30);
        h.add(10);
        h.add(12);
        h.add(20);
        System.out.println(h);
        for(Integer i:h){
            System.out.println(i);
        }
        //Iterator<E> l=h.iterator();
        Iterator<Integer> l=h.iterator();
        while(l.hasNext()){
            System.out.println(l.next());
        }
        System.out.println(h.contains(10));
        h.clear();
        System.out.println(h);
    }
}
