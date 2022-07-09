package LL;

import java.util.LinkedList;

public class usingFramework {
    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addLast("this");

        System.out.println(list);

        System.out.println(list.size());
    }
}
