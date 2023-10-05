package DSA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }
            else if(ch==')'){
                boolean val =  handleClosing(s,'(');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
            else if(ch=='}'){
                boolean val =  handleClosing(s,'{');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
            else if(ch==']'){
                boolean val =  handleClosing(s,'[');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
        }
        if(s.isEmpty()){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
    public static boolean handleClosing(Stack<Character> s , char cochar){
        if (s.isEmpty()) {
            return false;
        }else if(s.peek() == cochar){
            return false;
        }else{
            s.pop();
            return true;
        }
    }
}
