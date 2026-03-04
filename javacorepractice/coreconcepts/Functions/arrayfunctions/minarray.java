public class minarray {
    static int min(int[] arr){
        int min = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<min){
            min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {1,8,0,4};
        int result = min(arr);
        System.out.println(result);
    }
    
}
