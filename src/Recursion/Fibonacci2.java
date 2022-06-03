package Recursion;

public class Fibonacci2 {
//    To find the value of Nth fibanacci term
    public static int fib(int n){
        if(n==1){
            return n;
        }
        if(n==0){
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
