

public class evennumbers {
    static int counteven(int[] arr){
        int even = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]%2==0){
                even++;  
            }
        }
        return even;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6};
        int result = counteven(arr);
        System.out.println(result);
    }
    
}
