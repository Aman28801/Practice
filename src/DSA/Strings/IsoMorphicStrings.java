package DSA.Strings;
import java.util.HashMap;
public class IsoMorphicStrings {
    public static boolean check(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Boolean> map2 = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(map1.containsKey(c1)){
                if(map1.get(c1) != c2){
                    return false;
                }
            }else{
                if(map2.containsKey(c2)){
                    return false;
                }else{
                    map1.put(c1,c2);
                    map2.put(c2,true);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "abdb";
        String s2 = "wxzx";
        System.out.println(check(s1,s2));
    }
}
