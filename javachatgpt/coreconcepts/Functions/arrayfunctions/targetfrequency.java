

public class targetfrequency {
    static int frequency(int[] arr, int target){
      int count =0;
      for(int i=0; i<arr.length; i++){
        if(arr[i]==target){
            count++;
        }
      }
      return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,2};
        int target = 2;
        int result = frequency(arr,target);
        System.out.println(result);
    }
    
}
