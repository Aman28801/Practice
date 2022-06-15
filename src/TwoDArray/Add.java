package TwoDArray;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
//        int[][] arr =new int[3][3];
//        int[][] brr = new int[3][3];
        int[][] crr = new int[3][3];
//        Scanner sc =new Scanner(System.in);
        int[][] arr ={{3,5,9},{7,6,2},{4,3,5}};
        int[][] brr ={{1,5,2},{6,8,4},{3,9,7}};
//        for (int i =0 ;i<arr.length;i++){
//            for (int j = 0; j <arr[0].length ; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for (int i =0 ;i<brr.length;i++){
//            for (int j = 0; j <brr[0].length ; j++) {
//                brr[i][j] = sc.nextInt();
//            }
//        }
        for (int i =0 ;i<crr.length;i++){
            for (int j = 0; j <crr[0].length ; j++) {
                crr[i][j] = arr[i][j] + brr[i][j];
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
