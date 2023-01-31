//package HashMap;
//import java.util.*;
//
//public class Implimentation {
//    static class HashMap<K, V> {
//        public class Node {
//            K key;
//            V value;
//
//            public Node(K key, V value) {
//                this.key = key;
//                this.value = value;
//            }
//        }
//
//        private int n;              // no of key value pairs or number of nodes
//        private int N;              //no of index in an array or bucket length
//        private LinkedList<Node> buckets[];
//
//
//        @SuppressWarnings("Uncheaked")
//        public void Hashmap() {
//            this.N = 4;
//            this.buckets = new LinkedList[4];              // empty linked list creation
//        }
//
//        private int hashFunction(K key) {
//            int bi = buckets.hashCode();
//            return Math.abs(bi)%N;                         // to return bi in range[0 to N-1]
//        }
//
//        private int searchinLL(K key, int bi) {
//
//        }
//
//        public void put(K key, V value) {
//            int bi = hashFunction(key);
//            int di = searchinLL(key, bi); // if return (0+) then value exist in Array otherwise -1 will return
//            if (di == -1) {
//                //key does-not exist
//                buckets[bi].add(new Node(key, value));
//                n++;
//            }else{
//                Node data = buckets[bi].get[di];
//                data.value = data;
//            }
//        }
//    }
//}
