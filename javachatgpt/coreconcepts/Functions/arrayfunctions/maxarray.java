

public class maxarray {
    static int max(int[] arr){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>max){
            max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,8,3,4};
        int result = max(arr);
        System.out.println(result);
    }
    
}
