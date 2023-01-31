/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0;i<tc;i++){
            int no = sc.nextInt();
            ArrayList arr = new ArrayList();
            while(no!=0){
                int temp = no%10;
                no /= 10;
                arr.add(temp);
            }
            boolean ans = arr.contains(7);
            if (ans)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
