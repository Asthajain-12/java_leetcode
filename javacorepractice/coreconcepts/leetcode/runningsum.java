public class runningsum {
    public static int[] runningsum(int[] arr){
        int [] runningsum = new int[arr.length];
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            runningsum[i] = sum;
        }
        return runningsum;
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result = runningsum(arr);
        for(int i =0; i<result.length; i++){
        System.out.println(result[i]);
        }
    }
    
}
