import java.util.Scanner;
public class checksymmetric {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter rows");
        int m = scn.nextInt();
        System.out.println("Enter cols");
        int n = scn.nextInt();
        if(m!=n){
            System.out.println("not symmetric enter a square matrix");
            return;
        }
        int arr[][] = new int[m][n];
        int transpose[][] = new int[n][m];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                transpose[j][i] = arr[i][j];
            }

    }
    boolean symmetric = true;
    for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] != transpose[i][j]){
                    symmetric = false;
                    break;
                }
            }
        }
        if(symmetric){
            System.out.println("symmetric matrix");
        }
        else{
            System.out.println("not symmetric matrix");
        }

    
}}

