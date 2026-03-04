
public class containsduplicate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        boolean duplicate = false;
        for(int i=0; i<arr.length; i++){
          for(int j =0; j<i; j++){
            if(arr[j]==arr[i]){
                duplicate = true;
                break;
            }
          }
        }
        if(duplicate){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }
    
}
