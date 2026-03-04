import java.util.Scanner;
public class sumoffirstnnumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter n:");
        int n = scn.nextInt();
        int sum =0;
        for(int i=0; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);

        
    }
    
}
