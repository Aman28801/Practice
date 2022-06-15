package TwoDArray;

public class Subtraction {
    public static void main(String[] args) {
        int[][] crr = new int[3][3];
        int[][] arr ={{3,5,9},{7,6,2},{4,3,5}};
        int[][] brr ={{1,5,2},{6,8,4},{3,9,7}};
        for (int i =0 ;i<crr.length;i++){
            for (int j = 0; j <crr[0].length ; j++) {
                crr[i][j] = arr[i][j] - brr[i][j];
            }
        }
        for (int i =0 ;i<crr.length;i++) {
            for (int j = 0; j < crr[0].length; j++) {
                System.out.print(crr[i][j] + " ");
            }
            System.out.println();
        }



    }
}
