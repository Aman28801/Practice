package Recursion;

public class LastIndex {
    public static int lastindex(int[] arr ,int si, int data){
        if(si==arr.length){
            return -1;
        }
        int index =lastindex(arr,si+1,data);
            if(index==-1) {
                if (arr[si] == data) {
                    return si;
                } else {
                    return -1;
                }
            }
            else{
                return index;
                }
        }
        public static void main(String[] args) {
        int[] arr ={ 2,4,5,74,6,5,43,45};
        System.out.println(lastindex(arr,0,45));
    }
}
