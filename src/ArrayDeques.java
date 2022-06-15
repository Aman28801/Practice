import java.util.*;

public class ArrayDeques {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq= new ArrayDeque<>();

        //mid placements
//        dq.offer(10);
//        dq.offer(20);
//        dq.offer(30);
//        dq.offer(40);
//        dq.offer(50);

        //adding from first side
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);


        //adding from end side
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        for(int i=0;i<3;i++){
            dq.pollFirst();    //First 3 elements removed
            dq.pollLast();   //Last 3 elements removed
        }

        System.out.println(dq);   //[1,10]
    }
}
