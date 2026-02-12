import java.util.*;
public class LinkedListnew {
    public static void main(String[] args) {
        //homogeneous
        LinkedList<Integer> l=new LinkedList<>();
        l.add(20);
        l.add(20);
        l.add(40);
        l.add(10);
        l.addFirst(5);
        l.addLast(50);
        System.out.println(l.get(3));
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        l.remove(1);
        System.out.println(l);
        l.removeFirst();
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
        //same method of arraylist
        //get index of object
        System.out.println(l.indexOf(40));
        System.out.println(l.contains(20));
        l.clear();
        System.out.println(l);
        System.out.println(l.isEmpty());
        //heterogeneous
        LinkedList l1=new LinkedList();
        l1.add('A');
        l1.add(10);
        l1.add("hello");
        System.out.println(l1);

    }
}
