package TwoDArray;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[][] arr ={{3,5,9},{7,6,2},{4,3,5}};
        int[][] brr ={{1,5,2},{6,8,4},{3,9,7}};
        int m = arr.length;
        int n = arr[0].length;
        int[][] crr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                crr[i][j]=0;
                for (int k = 0; k <m; k++) {
                    crr[i][j]=crr[i][j]+arr[i][k]*brr[k][j];
                }

            }

        }
        for (int i =0 ;i<crr.length;i++){
            for (int j = 0; j <crr[0].length ; j++) {
                System.out.print(crr[i][j] +" ");
            }
            System.out.println();
        }

    }
}
