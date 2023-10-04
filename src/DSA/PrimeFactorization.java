package DSA;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i = 2; i*i<= n; i++){
            while(n%i==0){
                n = n/i;
                System.out.println(i);

            }
        }
        if(n!=1){
            System.out.println(n);
        }
    }
}
