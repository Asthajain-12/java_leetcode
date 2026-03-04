import java.util.Scanner;

public class countodd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
       int count=0;
       for(int i=0; i<n; i++){
          if(arr[i]%2!=0){
            count+=1;
          }
       }
       System.out.println("odd num are:"+ count);
}
}
