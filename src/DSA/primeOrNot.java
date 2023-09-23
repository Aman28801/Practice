package DSA;

import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int count=0;
            for(int j=2;j*j<=n;j++){
                if(n%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }
        }

    }
}
