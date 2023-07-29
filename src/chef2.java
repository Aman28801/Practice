/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

class chef2
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int j = 0; j < tc; j++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] arr = new int[x];
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int m = x-y;
            System.out.println(arr[m]-1);
        }
    }
}
