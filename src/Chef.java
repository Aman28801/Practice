import java.util.Scanner;

public class Chef {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int y = sc.nextInt();
            if(y>=2000){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
