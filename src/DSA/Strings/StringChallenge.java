package DSA.Strings;

public class StringChallenge {
    public static void main(String[] args) {
        String str = "Hello";
        modify(str);
        System.out.println(str);
    }
    public static void modify(String s){
        s = s.concat("World");
    }
}
