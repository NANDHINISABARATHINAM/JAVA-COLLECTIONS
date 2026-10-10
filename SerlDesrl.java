import java.io.*;

class Demo implements Serializable{
   transient String name="abc";
   transient int password=123;
   //transient
    //when storing values during serialization it stores default value
    //only for variables
    //so null 0
    //if used along with static or final no use
    //abc 123 output
    //so avoid static and final
    //Explicitly instructs the Java Virtual Machine (JVM) to skip the field during serialization. Its value is restored to its default type value (like null or 0) when deserialized.

}
public class SerlDesrl {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Demo ob=new Demo();
        //Serialization
        FileOutputStream f=new FileOutputStream("text.ser");
        ObjectOutputStream obst=new ObjectOutputStream(f);
        obst.writeObject(ob);
        //Deserialization
        FileInputStream f1=new FileInputStream("text.ser");
        ObjectInputStream obin=new ObjectInputStream(f1);
        Demo obj=(Demo)obin.readObject();
        String s="hello";
        System.out.println(obj instanceof Demo);
        //System.out.println(obj instanceof String);
        System.out.println(s instanceof String);
        System.out.println(obj.name);
        System.out.println(obj.password);
        //if two classes a and b execute in order if both serialize des in order a and b,if want b no first b,first a then b
    }
}
