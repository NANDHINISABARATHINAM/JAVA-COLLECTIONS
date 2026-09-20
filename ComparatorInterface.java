import java.util.*;
import java.util.Map.*;
import java.lang.*;
class Demo implements Comparator<UserCls>
    {
        public int compare (UserCls a, UserCls b){
            return a.name.compareTo(b.name);
        }
    }
public class UserCls1 implements Comparator<UserCls>{
    Integer id;
    String name;
    String job;
    public UserCls1() {
    }
    public UserCls1 (Integer id, String name, String job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }
    public int compare(UserCls ob1,UserCls ob2){
        //no need
        if(ob1.id>ob2.id)
            return 1;
        else if(ob1.id<ob2.id)
            return -1;
        else
            return 0;
        //return ob1.id.compareTo(ob2.id);
    }
    @Override
    public String toString() {
        return "UserCls [id=" + id + ", name=" + name + ", job=" +job;
    }
	public static void main(String[] args) {
		ArrayList<UserCls> al=new ArrayList<>();
        al.add(new UserCls (2, "kanish", "police"));
        al.add(new UserCls (1, "arun", "software"));
        al.add(new UserCls (3, "harshitha", "tester"));
        System.out.println(al);
        Collections.sort(al,new UserCls1());
        for(UserCls u:al){
            System.out.println(u);
            
        }
        Collections.sort(al,new Demo());
        for(UserCls u:al){
            System.out.println(u);
            
        }
    }
}

import java.util.*;
import java.util.Map.*;
import java.lang.*;
public class UserCls implements Comparable<UserCls>{
    Integer id;
    String name;
    String job;
    public UserCls (Integer id, String name, String job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }
    public int compareTo(UserCls ob){
        //no need
        /*if(id<ob.id)
            return 1;
        else if(id>ob.id)
            return -1;
        else
            return 0;*/
        return ob.id.compareTo(id);
    }
    @Override
    public String toString() {
        return "UserCls [id=" + id + ", name=" + name + ", job=" +job;
    }
	public static void main(String[] args) {
		ArrayList<UserCls> al=new ArrayList<>();
        al.add(new UserCls (2, "kanish", "police"));
        al.add(new UserCls (1, "arun", "software"));
        al.add(new UserCls (3, "harshitha", "tester"));
        System.out.println(al);
        Collections.sort(al);
        for(UserCls u: al){
            System.out.println(u);
            
        }
    }
}
