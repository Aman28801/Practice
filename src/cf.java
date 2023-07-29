import java.util.*;

class cf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int j=0;j<tc;j++){
            int x = 0, y = 0;
            int n=sc.nextInt();
            String str = sc.next();
            for (int i = 0; i<str.length(); i++) {
                if (str.charAt(i) == 'U') {
                    y++;
                }
                if (str.charAt(i) == 'L') {
                    x--;
                }
                if (str.charAt(i) == 'D') {
                    y--;
                }
                if (str.charAt(i) == 'R') {
                    x++;
                }
                if (x == 1 && y == 1) {
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");
        }
    }
}