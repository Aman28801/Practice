package Recursion;

public class StringPalindrome {
    public static boolean check(String str ,int i){
        if(i>=str.length()){
            return true;
        }if(str.charAt(i)!=str.charAt(str.length()-i-1)){ //same as arr[i] != arr[n-i-1]; here n = arr.length
            return false;
        }
        return check(str ,i+1);
    }
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(check(str,0));
    }
}
