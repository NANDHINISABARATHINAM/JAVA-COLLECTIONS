import java.util.*;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        p.add(30);
        p.add(20);
        p.add(15);
        p.add(25);
        p.add(10);
        System.out.println(p);
        p.remove(20);
        System.out.println(p);
        // Access the head element without removing
        System.out.println("Head using peek(): " + p.peek());
        System.out.println("Head using element(): " + p.element());
        Iterator i = p.iterator();
        while(i.hasNext()) {
            System.out.print(i.next()+" ");
        }
    }
}
