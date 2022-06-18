import java.util.HashSet;

public class Hashsets {
    public static void main(String[] args) {
        //initialization method 1
        HashSet<Integer> hs = new HashSet<>(); //if not provided the initial capacity the default is 16
        // and oad factor is the factor, or we can say the gap between the elements
        //initialization method 1
        HashSet<Integer> hs1 = new HashSet<>(20, 0.5f);

        hs.add(10);
        hs.add(30);
        hs.add(20);
        hs.add(10);

        //no duplicate elements can be stored in hashset
        //elements are stored in random manner

        System.out.println(hs);  // [10,20,30] --> it can be in any order
//        System.out.println(hs.isEmpty());  //True

    }
}
