import java.util.Scanner;
public class Sum2DArrayOperations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter rows:");
        int m = scn.nextInt();
        System.out.println("enter cols:");
        int n = scn.nextInt();
        int arr[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }

        }
            for(int i=0; i<m; i++){
                int rowsum = 0;
                for(int j=0; j<n; j++){
                    rowsum+=arr[i][j];
                }
                System.out.println("rowsum="+ i + "=" + rowsum);
            }
            
            for(int j=0; j<n; j++){
                int colssum = 0;
                for(int i=0; i<m; i++){
                    colssum+=arr[i][j];
                    
                }
                System.out.println("colssum="+ j + "=" + colssum);

        }
        
    }
}
    

