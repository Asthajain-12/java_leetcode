import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter string");
        String s = scn.nextLine();
        System.out.println("Enter ch to replace");
        char oldchar = scn.next().charAt(0);
        System.out.println("Enter new ch");
        char newchar = scn.next().charAt(0);
        String v = s.replace(oldchar, newchar);
        System.out.println(v);
    }
    
    
}
