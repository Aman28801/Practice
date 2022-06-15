import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list2.add(10);
        list2.add(20);
        list2.add(30);

        System.out.println(list.size()); // 3
        for (int val : list) {
            System.out.println(val); //10   20   30
        }
        System.out.println(list); //[10,20,30]

        list.remove(2);
        System.out.println(list); //[10,20]

        list.add(2,30);
        System.out.println(list);  //[10,20,30]

        list.set(1,2000);
        System.out.println(list);  //modify  [10,2000,30]



        list.removeAll(list2);   //list 2 elements are removed from list
        System.out.println(list);


        list.retainAll(list2);  //same in both the lists
        System.out.println(list2);

    }
}
