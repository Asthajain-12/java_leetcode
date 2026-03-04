import java.util.Scanner;
public class maxarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
            int max= arr[0];
            for(int i=1; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("max element is"+ max);

           
            }
            
        }

    
    

