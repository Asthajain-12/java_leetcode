import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number a: ");
        int a = scn.nextInt();
        System.out.println("Enter second number b: ");
        int b = scn.nextInt();
        System.out.println("Sum of a and b is:");
        int sum = a+b;
        System.out.println(a + "+" + b + "=" + sum);

    }
    
}
