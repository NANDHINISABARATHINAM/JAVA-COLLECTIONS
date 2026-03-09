import java.util.*;
class User{
    int id;
    String name;
    String job;
    User(int id,String name,String job){
        this.id=id;
        this.name=name;
        this.job=job;
    }
    public String toString(){
        return id+" "+name+" "+job;
    }
}

public class UserDefObj {
    public String toString(){
        return "UserDefObj";
    }
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add(10);
        l.add("hello");
        l.add('A');
        l.add(new UserDefObj());
        System.out.println(l);
        ArrayList<User> l1=new ArrayList<>();
        l1.add(new User(1,"A","Software Developer"));
        l1.add(new User(2,"B","Tester"));
        l1.add(new User(3,"C","Lead"));
        System.out.println(l1);
        for(User u:l1){
            System.out.println(u);
        }
    }
}
