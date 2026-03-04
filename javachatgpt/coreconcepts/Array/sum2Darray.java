import java.util.Scanner;
public class sum2Darray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter rows:");
        int m = scn.nextInt();
        System.out.println("enter cols:");
        int n = scn.nextInt();
        System.out.println("Enter array elements:");
        int arr[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
            int totalsum = 0;
            for(int i=0; i<m;i++){
                for(int j=0; j<n; j++){
                    totalsum+=arr[i][j];
                    System.out.println("Adding arr[" + i + "][" + j + "] = "+ arr[i][j]+" total sum = "+totalsum);

                }
        }
        System.out.println("Total Sum:" + totalsum);
    }
    

        
    }
    

