import java.util.TreeSet;

public class TreesSets {
    public static void main(String[] args) {
        TreeSet<Integer> t =new TreeSet<>();
        t.add(4);
        t.add(7);
        t.add(3);
        t.add(1);

        //Automatically arranged in sorted order
        System.out.println(t);
        System.out.println(t.ceiling(6)); //greater than or equall to element is printed

        System.out.println(t.first());  // to get first value

        System.out.println(t.floor(5));   //to get less than or equall to the value


        t.pollLast();  //remove last element
        System.out.println(t);

    }
}
