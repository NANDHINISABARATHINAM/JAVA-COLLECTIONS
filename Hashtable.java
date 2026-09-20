import java.util.*;
import java.util.Map.*;
public class Hashtable
{
	public static void main(String[] args) {
		Hashtable<Integer, String> h=new Hashtable<Integer, String>();
        h.put(10, "hello");
        h.put(20, "welcome");
        h.put(30, "good");
        h.put(40, "morning");
        h.put(50,"evening");
        System.out.println(h);
    }
}
