package DSA;

import java.util.Scanner;
// horizontally print the number

public class NumberPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int count=0;
        while(temp!=0){
            temp = temp/10;
            count++;
        }
        int div = (int)Math.pow(10,count-1);
        while(div!=0){
            int ans = number/div;
            System.out.println(ans);
            number = number%div;
            div = div/10;
        }
    }
}
