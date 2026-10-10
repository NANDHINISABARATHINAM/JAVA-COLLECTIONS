class A{
    //Singletonclass ob=new Singletonclass();
}
public class Singletonclass {
    private static Singletonclass instance;
    private Singletonclass(){

    }
    public static Singletonclass getInstance(){
        if(instance==null) {
            instance = new Singletonclass();
            return instance;
        }
        return instance;
    }
    public static void main(String[] args) {
        System.out.println(Singletonclass.getInstance());
        System.out.println(Singletonclass.getInstance());
        System.out.println(Singletonclass.getInstance());
    }
}
