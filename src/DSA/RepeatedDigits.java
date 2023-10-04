package DSA;

import java.util.Scanner;

public class RepeatedDigits {

    public static int freq(int n, int k){
        int count=0;
        while(n>0){
            int dig =n%10;
            n=n/10;
            if(dig==k){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(freq(n,k));
    }
}
