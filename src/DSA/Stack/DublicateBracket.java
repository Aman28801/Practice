package DSA.Stack;
import java.util.*;
public class DublicateBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==')'){
                if(s.peek()=='('){
                    System.out.println("True");
                    return;
                }else{
                    while(s.peek()!='('){
                        s.pop();
                    }
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        System.out.println("False");
    }
}
