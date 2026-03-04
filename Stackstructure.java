import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        //insert object
        s.push(100);
        s.push(200);
        s.push(300);
        s.push(400);
        //remove last inserted object
        s.pop();
        //print last top object
        System.out.println(s.peek());
        //search element return index
        System.out.println(s.search(100));
        System.out.println(s);
        System.out.println(s.capacity());
    }
}
