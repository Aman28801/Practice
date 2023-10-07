package DSA.Stack;

import java.util.*;
public class NextGreaterElementToTheRight {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,4,5,3};
        System.out.println(Arrays.toString(span(arr)));;
    }
    public static int[] span(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] span = new int[arr.length];
        s.push(0);
        span[0] = 1;

        for(int i=1;i< arr.length;i++){
            while(!s.isEmpty() && arr[i] > arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                span[i] = i - s.peek();
            }
            s.push(i);
        }
        return span;
    }
}
