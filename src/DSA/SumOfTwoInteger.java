package DSA;

public class SumOfTwoInteger {
    static int getsum(int a,int b){
        int xor = a^b;
        int carry = a&b;
        if (carry==0){
            return xor;
        }else{
            return getsum(xor,carry<<1);
        }
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.println(getsum(a,b));
    }
}
