import java.util.Scanner;

public class imp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter digit:");
        int n = scn.nextInt();
        int count = 0 ;
        int sum =0;
        int rev =0;
        while(n!=0){
          int q = n%10;
          sum +=q;
          rev = rev*10+q;
          count++;
          n= n/10;

        }
         System.out.println("Count is:"+count);
         System.out.println("Sum is:"+sum);
         System.out.println("Reverse is:"+rev);

         scn.close();

        }
    }
    

