package DSA.Strings;

import java.util.Arrays;

public class AnagramStrings {
    public static String SortString(String str){
        char[] c = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public static boolean check(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        s1 = SortString(s1);
        s2 = SortString(s2);

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "AMAN";
        String s2 = "ANAM";
        System.out.println(check(s1,s2));;
    }
}
