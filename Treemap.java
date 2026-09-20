import java.util.*;
import java.util.Map.*;
class Demo implements Comparable<Demo>{
    Integer a;
    Demo(Integer a){
        this.a=a;
    }
    @Override
    //asc
    /*public int compareTo(Demo o) {
    return a.compareTo(o.a);
    }*/
    //desc
    public int compareTo(Demo o) {
    return o.a.compareTo(a);
    }
    public String toString(){
        return a+"";
    }
}
public class Treemap
{
	public static void main(String[] args) {
		TreeMap<Integer, String> t=new TreeMap<>();
        t.put(3, "java");
        t.put(1, "c");
        t.put(2, "c++");
        t.put(1, "dot net");
        t.put(4, null);
        //no null key
        System.out.println(t);
        
        TreeMap<Demo, String> t1=new TreeMap<Demo, String>();
        t1.put(new Demo(10), "one");
        t1.put(new Demo(5), "two");
        t1.put(new Demo(20), "three");
        System.out.println(t1);
    }
}
