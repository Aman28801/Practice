import java.util.PriorityQueue;

public class PriorityDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(13);
        pq.add(5);
        pq.add(16);
        pq.add(2);

        System.out.println(pq.peek());  //2

        System.out.println(pq); //[2, 5, 10, 16, 13]
        //remove root value
        pq.poll();
        System.out.println(pq);   //[5, 13, 10, 16]


    }
}
