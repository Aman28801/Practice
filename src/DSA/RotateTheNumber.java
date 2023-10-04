package DSA;

import java.util.Scanner;

public class RotateTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int temp = n;
        int count=0;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
//        System.out.println(count);

        k =k % count;     // for cycle in k
        if(k<0){
            k = k + count; //for negative k
        }

        int div =1;
        int mul =1;
        for(int i=1;i<=count;i++){
            if(i<=k){
                div = div*10;
            }else{
                mul = mul*10;
            }
        }
        int q = n/div;
        int r = n%div;
        int result = r * mul + q;
        System.out.println(result);
    }
}
