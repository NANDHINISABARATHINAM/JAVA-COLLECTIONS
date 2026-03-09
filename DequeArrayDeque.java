import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> p=new ArrayDeque<>();
        p.add(11);
        p.add(22);
        p.add(33);
        p.add(44);
        p.offer(55);
        System.out.println(p);
        //to delete first inserted value
        p.poll();
        p.remove(22);
        System.out.println(p);
        // Access the head element without removing
        System.out.println("Head using peek(): " + p.peek());
        System.out.println("Head using element(): " + p.element());
        Iterator i = p.iterator();
        while(i.hasNext()) {
            System.out.println(i.next()+" ");
        }
        p.addFirst(10);
        p.addLast(20);
        int f = p.removeFirst();
        int l = p.removeLast();
        // Displaying the Deque
        System.out.println("First: " + f + ", Last: " + l);
        System.out.println(p);

        ArrayDeque<Integer> p1=new ArrayDeque<>();
        //stack
        p1.push(66);
        p1.push(77);
        p1.push(88);
        p1.push(99);
        System.out.println(p1);
        p1.pop();
        System.out.println(p1);
    }
}
