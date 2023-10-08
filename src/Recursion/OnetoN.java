package Recursion;

public class OnetoN {
    public static void print(int x) {
        if (x == 0) {
            return;
        }else{
            print(x-1);
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int x = 5;
        print(x);
    }
}
