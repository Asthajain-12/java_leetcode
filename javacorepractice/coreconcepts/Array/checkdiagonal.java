import java.util.Scanner;
public class checkdiagonal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter rows");
        int m = scn.nextInt();
        System.out.println("enter cols");
        int n = scn.nextInt();
        if(m!=n){
            System.out.println("enter a square matrix");
            return;
        }
        int arr[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        boolean diagonal = true;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i!=j && arr[i][j]!=0){
                    diagonal = false;
                    break;
                } }}
                if(diagonal){
                    System.out.println("diagonal matrix");
                }
                else{
                    System.out.println("not Diagonal");
                }
            }}