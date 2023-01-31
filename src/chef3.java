import java.util.Scanner;

public class chef3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int x = sc.nextInt();
            int[] a = new int[x];
            int max = Integer.MAX_VALUE;
            for(int i=0;i<=x;i++){
                a[i]=sc.nextInt();
                if(a[i]<max){
                    max = a[i];
                }
                System.out.println(max);
            }
        }
    }
}
