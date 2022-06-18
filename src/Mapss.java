import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapss {
    public static void main(String[] args) {

        //HashMap --> Unsorted
        Map<Integer,String> hm =new HashMap<Integer,String>();
        hm.put(19,"A");
        hm.put(4,"B");
        hm.put(12,"F");
        hm.put(3,"R");
        System.out.println(hm);   //{19=A, 3=R, 4=B, 12=F}  random
        System.out.println(hm.size());  //4
//        for (int i = 0; i <= hm.size(); i++) {
//            System.out.println(hm.get(i));
//        }

//            Treemap  --> Sorted

        TreeMap<Integer,Integer> tm =new TreeMap<>();
        tm.put(1,100);
        tm.put(5,150);
        tm.put(3,200);
        tm.put(6,150);
        System.out.println(tm);  //{1=100, 3=200, 5=150, 6=150} --> sorted
        System.out.println(tm.get(3));  //200

        TreeMap<Integer,Integer> tm1 =new TreeMap<>(tm.subMap(1,7));
        System.out.println(tm1);  //{1=100, 3=200, 5=150, 6=150}  2 and 4 position is empty in hash table




    }
}
