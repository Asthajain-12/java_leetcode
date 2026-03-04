import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = scn.nextInt(); 
        int arr[] = new int[n];
        int sum=0;
       for(int i =0; i<n; i++){
        arr[i] = scn.nextInt();
        sum +=arr[i];
        
    }
    System.out.println(sum);
}

    
}
