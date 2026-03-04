

public class copyarray {
  public static int[] copyarray(int[] arr){
    int[] copy = new int[arr.length];
    for(int i=0; i<arr.length; i++){
        copy[i] = arr[i];
    }
    return copy;
  }
  public static void main(String[] args) {
   int [] arr = {1,2,3,5,6};
   int[] result = copyarray(arr);
   for(int i=0; i<result.length; i++){
    System.out.print(result[i]+" ");
   }
  }
    
}
