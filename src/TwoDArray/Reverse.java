package TwoDArray;

public class Reverse {
    public static void reverse(int[][] arr){
        
        for(int i=0;i<arr.length;i++){
            int li =0;
            int hi =arr[i].length-1;
            while(li<hi){
                int temp = arr[i][li];
                arr[i][li]=arr[i][hi];
                arr[i][hi]=temp;

                li++;
                hi--;
            }
        }
        for (int i =0 ;i<arr.length;i++){
            for (int j = 0; j <arr[0].length ; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] arr ={{3,5,9},{7,6,2},{4,3,5}};
        reverse(arr);
        
    }
}
