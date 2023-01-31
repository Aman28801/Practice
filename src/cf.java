import java.util.*;
public class cf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] friends = new int[t];
        int[] answer = new int[t];
        for (int i = 0; i < t; i++) {
            friends[i] = in.nextInt();
            answer[friends[i]-1] = i + 1;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < t; i++)
            ans.append(answer[i]).append(" ");
        ans.deleteCharAt(ans.length()-1);
        System.out.println(ans.toString());
        in.close();
    }
}
