

public class linearsearch {
    public static int search(int[]arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i; 
            }
        }  
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,4,3,5};
        int target = 4;
        int result = search(arr,target);
        System.out.println("element found at: " + " " + result);
    }
    
}
