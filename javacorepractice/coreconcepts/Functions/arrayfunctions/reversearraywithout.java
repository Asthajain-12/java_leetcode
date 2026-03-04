

public class reversearraywithout {
    public static int[] reverse(int[] arr){
        int[] reverse = new int[arr.length];
        int j=0;
        for(int i=arr.length-1; i>=0; i--){
            reverse[j] = arr[i];
            j++;
        }
        return reverse;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] result = reverse(arr);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
    
}
