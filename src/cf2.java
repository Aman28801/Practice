import java.util.*;

public class cf2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        String str = "codeforces";
        for(int i=0 ;i<tc ;i++){
            String c = sc.next();
            for(int j=0;j<str.length();j++){
                if(c.charAt(0)==str.charAt(j)){
                    System.out.println("Yes");
                    break;
                }else{
                    System.out.println("No");
                    break;
                }
            }
        }
    }
}
