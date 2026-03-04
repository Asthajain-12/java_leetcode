import java.util.Scanner;

public class counteveodd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = scn.nextInt();
        int even=0;
        int odd=0;
        for(int i=1; i<=n; i++){
            System.out.println("Enter num" + i + ":");
            int num = scn.nextInt();
            if(num%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("even numbers:"+ even);
        System.out.println("odd numbers:"+ odd);
    }
    
}
