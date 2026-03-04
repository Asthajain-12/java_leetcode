public class secondlargest {
    static int secondlargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
            secondlargest = largest;
            largest = arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
    public static void main(String[] args) {
        int [] arr = {1,7,8,9,4,10};
        int result = secondlargest(arr);
        System.out.println(result);
    }
    
}
