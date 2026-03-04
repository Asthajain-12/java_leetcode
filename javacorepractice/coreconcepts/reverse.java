import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rev=0;
        while(n!=0){
         int q=n%10;
         rev = rev*10 + q;
         n = n/10;

        }
        System.out.println(rev);
        
    }
    
}
