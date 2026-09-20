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
