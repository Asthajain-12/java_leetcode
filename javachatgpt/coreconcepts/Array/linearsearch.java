import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter array size:");
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
            
        }
        System.out.println("enter targeted element:");
        int target = scn.nextInt();
        boolean found = false;
        for(int i=0; i<n; i++){
            if(arr[i]==target){
                System.out.println("element found at index"+i);
                found = true;
                break;

            }
            
        }
        if(!found){
                System.out.println("element not found");
            }
        
    }
    
}
