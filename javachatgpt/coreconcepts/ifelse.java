import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter year");
        int a = scn.nextInt();
        if(a%4==0 && (a%100!=0 || a%400==0)){
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }
    }
    
}
