import java.util.Scanner;
public class indexof {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the string");
        String s = scn.nextLine();
        System.out.println("enter character");
        char ch = scn.next().charAt(0);
        System.out.println(s.indexOf(ch));
     }
    
}
