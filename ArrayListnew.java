import java.util.* ;
public class ArrayListnew {
    public static void main(String[] args) {
        //homogeneous object
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(20);
        a.add(null);
        a.add(100);
        System.out.println(a);
        a.add(1,30);
        System.out.println(a);
        //heterogeneous object
        ArrayList b=new ArrayList();
        b.add("hello");
        //add all from index 1
        b.addAll(1,a);
        b.add('A');
        //add all
        b.addAll(a);
        System.out.println(b);
        //get values
        System.out.println(a.get(4));
        System.out.println(b.get(0));
        //save value
        Integer n=a.get(3);
        System.out.println(n);
        //String s=b.get(0);  error because type is not given
        Object s=b.get(0);
        System.out.println(s);
        //so do type cast
        String s1=(String)b.get(0);
        System.out.println(s1);
        //to change value in list set dont shift
        a.set(1,33);
        System.out.println(a);
        //remove by index
        a.remove(3);
        System.out.println(a);
        //copy
        ArrayList<Object> d = new ArrayList<>();
        d.add("hello");
        d.addAll(a);
        d.add('A');
        d.set(2,20);
        ArrayList<Integer> c=new ArrayList<>();
        c.add(10);
        c.add(30);
        c.add(20);
        c.add(20);
        c.add(null);
        c.add(100);
        //remove all c in b common values
        System.out.println("c: "+c);
        System.out.println("b: "+b);
        b.removeAll(c);
        System.out.println(b);
        //retain all keep common values(give common values in both)
        System.out.println("c: "+c);
        System.out.println("d: "+d);
        d.retainAll(c);
        System.out.println(d);
        //clear only values not list
        c.clear();
        System.out.println(c);
        //check list is empty
        System.out.println(c.isEmpty());
        //contains element?
        System.out.println(a.contains(10));
    }
}
