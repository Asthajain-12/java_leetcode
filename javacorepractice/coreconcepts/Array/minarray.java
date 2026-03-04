import java.util.Scanner;
public class minarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
            int min= arr[0];
            for(int i=1; i<n; i++){
                if(arr[i]<min){
                    min= arr[i];
                }
               
            }
            System.out.println("min element is"+min);
        }
          

    }
    

