import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("ArrayList");
        ArrayList<String> c=new ArrayList<String>();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        c.add("e");
        System.out.println(c);
        c.add(0,"m");
        System.out.println(c);
        //insert element at begning of list
        System.out.println(c.get(0));
        //access first element
        System.out.println(c);
        c.set(0,"o");
        //change an element
        System.out.println(c);
        c.remove(5);
        //remove an element at position index
        System.out.println(c);
        System.out.println(c.size());
        //size
        for(int i=0;i<c.size();i++){
            System.out.print(c.get(i)+" ");
        }
        System.out.println();
        //for loop
        for(String i:c){
            System.out.print(i+" ");
        }
        System.out.println();
        //for each loop
        Collections.sort(c);
        System.out.println(c);
        //sort
        var b=new ArrayList<String>();
        b.add("a");
        b.add("b");
        b.add("c");
        System.out.println(b);
        b.addAll(c);
        System.out.println(b);
        //addall
        b.addAll(1,c);
        System.out.println(b);
        //addall at position
        ArrayList<String> c2=(ArrayList)c.clone();
        //clone
        System.out.println(c2);
        System.out.println(c.contains("b"));
        //contains item exists true/false
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.ensureCapacity(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        //ensurecapacity
        System.out.println(list.size());
        ArrayList<Integer> num=new ArrayList<Integer>();
        num.add(11);
        num.add(2);
        num.add(13);
        num.add(44);
        num.add(5);
        num.forEach((n)->{System.out.print(n+" ");});
        System.out.println();
        //for each
        System.out.println(c.indexOf("a"));
        //position of element
        System.out.println(c.isEmpty());
        //isempty? true/false
        c.add("o");
        System.out.println(c);
        System.out.println(c.lastIndexOf("o"));
        //last occurrence of value in list
        ListIterator<String> it=c.listIterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        //list iterator front loop
        System.out.println();
        while(it.hasPrevious()){
            System.out.print(it.previous()+" ");
        }
        //list iterator for back loop
        System.out.println();
        list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(1));
        //remove by value
        System.out.println(list);
        c2.removeAll(c2);
        System.out.println(c2);
        ArrayList ccc=(ArrayList) c.clone();
        System.out.println(ccc);
        ArrayList<String> r=new ArrayList<String>();
        r.add("a");
        r.add("b");
        r.add("c");
        System.out.println(r);
        c.removeAll(r);
        System.out.println(c);
        System.out.println(r);
        num.removeIf(n->n%2==0);
        System.out.println(num);
        num.replaceAll(n->n+1);
        System.out.println(num);
        ccc.retainAll(r);
        System.out.println(ccc);
        //remove items from the list which does not belong to specified collection
        ccc.sort(null);
        System.out.println(ccc);
        //sort alphabetically
        r.sort( (aa, bb) -> { return -1 * aa.compareTo(bb); } );
        System.out.println(r);
        //lambda expression reverse alphabetically order
        System.out.println(ccc.subList(1,3));
        //sublist
        Object[] ca=ccc.toArray();
        for(Object i:ca){
            System.out.print(i+" ");
        }
        System.out.println();
        //ArrayList to Array
        String[] caa = new String[3];
        caa=r.toArray(caa);
        for(String i:caa){
            System.out.print(i+" ");
        }
        System.out.println();
        //specify return type
        ccc.trimToSize();
        //trim reduce capacity
        System.out.println(ccc);
        c.clear();
        //remove all elements
        System.out.println(c);
        
    }
}
