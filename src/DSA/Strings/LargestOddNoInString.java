package DSA.Strings;

public class LargestOddNoInString {
    public static String ss(String s){
        int n = Integer.parseInt(s);
        while(n>0){
            if(n%2!=0){
                return Integer.toString(n);
            }
            else{
                n = n/10;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String s = "124942";
        System.out.println(ss(s));
    }
}
