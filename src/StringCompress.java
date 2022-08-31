import java.util.Scanner;

public class StringCompress {
    public static String Compress(String s){
        String str= String.valueOf(s.charAt(0));
        for(int i=1 ;i<s.length();i++){
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            if(curr!=prev){
                str += curr;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        System.out.println(Compress(s));;
    }
}
