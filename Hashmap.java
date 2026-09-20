import java.util.*;
import java.util.Map.*;
public class Hashmap
{
	public static void main(String[] args) {
		HashMap<Integer, String> m=new HashMap<Integer, String>();
        m.put(2, "A");
        m.put(4, "F");
        m.put(null, "C");
        m.put(5, "F");
        m.put(2, "E");
        m.put(9,null);
        m.putIfAbsent(5,"F");
        System.out.println(m);
        System.out.println(m.containsKey(null));
        System.out.println(m.containsValue("B"));
        System.out.println(m.get(2));
        m.remove(2);
        System.out.println(m);
        System.out.println(m.size());
        System.out.println(m);
        System.out.println(m.entrySet());
        System.out.println(m.values());
        System.out.println(m.keySet());
        for(Entry<Integer,String> e:m.entrySet()){
            System.out.println(e);
        }
        for(Entry<Integer,String> e:m.entrySet()){
            System.out.println(e.getKey());
        }
        for(Entry<Integer,String> e:m.entrySet()){
            System.out.println(e.getValue());
        }
    }
}
