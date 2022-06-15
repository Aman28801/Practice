import java.util.*;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(40);
        l2.add(50);
        l2.add(60);
        int n =l1.indexOf(20);
        System.out.println(l1);
        System.out.println(n);
        l1.addAll(l2);
        System.out.println(l1);
//        String s =l1.toString();
//        System.out.println(s);
        int m =l1.peekLast();
        System.out.println(m);



    }


}
