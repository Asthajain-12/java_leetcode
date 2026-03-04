import java.util.Scanner;
public class split {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter string");
        String s = scn.nextLine();
        String[] words = s.split(" ");
        for(int i=0; i< words.length; i++){
            System.out.println(words[i]);
        }
        
    }
    
}
