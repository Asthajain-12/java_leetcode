public class minmaxdiff {
    public static int difference(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];

            }
        }
        return max-min;

    }
    public static void main(String[] args) {
        int[] arr = {1,9,3,4,5};
        int result = difference(arr);
        System.out.println(result);
    }
    
}
