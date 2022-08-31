package TwoDArray;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr ={{3,5,9},{7,6,2},{4,3,5}};
        int m = arr.length;
        int n = arr[0].length;
        int[][] ans =new int [m][n];
        for(int i=0; i<m ;i++){
            for (int j=i; j<n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]= temp;
            }

        }
        for (int i =0 ;i<ans.length;i++){
            for (int j = 0; j <ans[0].length ; j++) {
                System.out.print(ans[i][j] +" ");
            }
            System.out.println();
        }
    }
}
