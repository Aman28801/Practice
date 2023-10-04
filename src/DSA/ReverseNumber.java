package DSA;
import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0){
            int ans = n%10;
            System.out.print(ans);
            n=n/10;
        }
    }
}
