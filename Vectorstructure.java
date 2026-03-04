import java.util.*;
public class Main {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.addElement(20);
        v.add(10);
        v.addElement(5);
        v.add(15);
        v.removeElementAt(0);
        System.out.println(v);
        //get element by index
        System.out.println(v.elementAt(0));
        System.out.println(v.capacity());
        v.add("hi");
        v.add('a');
        v.add(100);
        v.add("hello");
        v.add(true);
        v.add(80);
        v.add("java");
        v.add("hiii");
        System.out.println(v.capacity());


    }
}
