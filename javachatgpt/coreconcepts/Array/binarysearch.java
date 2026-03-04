import java.util.Scanner;
public class binarysearch {
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
        int start =0;
        int end = n-1;
         
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                System.out.println("element found at index:"+ mid);
                found = true;
                break;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
                
            }
            if(!found){
                    System.out.println("element not found");
                }

            }

        }