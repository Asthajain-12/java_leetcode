import java.util.Scanner;

public class largestofthreenum {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter first num:");
    int a = scn.nextInt();
    System.out.println("Enter second num:");
    int b = scn.nextInt();
    System.out.println("Enter third num:");
    int c = scn.nextInt();
    if(a>b && a>c){
        System.out.println("A is greater");
    }
    else if(b>a && b>c){
        System.out.println("B is greater");
    }
    else if(c>a && c>b){
        System.out.println("C is greater");
    }
    else{
        System.out.println("num are equal");
    }
        
    }
    
    
}
