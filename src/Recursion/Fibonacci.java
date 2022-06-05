package Recursion;

import java.util.Scanner;

public class Fibonacci {
    //to print fibonacci series
    public static void fibonacci(int a, int b, int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibonacci(b,c,n-1);
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        fibonacci(a,b,n-2);
    }
}
