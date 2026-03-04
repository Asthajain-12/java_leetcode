 import java.util.Scanner;
public class transpose {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter rows:");
        int m = scn.nextInt();
        System.out.println("enter cols:");
        int n = scn.nextInt();
        int arr[][] = new int[m][n];
        int transpose[][] = new int[n][m];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            } }
            for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                transpose[j][i] = arr[i][j];
            }}
             for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
            System.out.print(transpose[i][j]+" ");
         }
         System.out.println();
         } 
    }
    
}
