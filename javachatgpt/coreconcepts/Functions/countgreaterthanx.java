public class countgreaterthanx {
    public static int count(int[] arr, int target){
        int c = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]>target){
                c++;

            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int target = 3;
        int result = count(arr,target);
        System.out.println(result);

    }
    
}
