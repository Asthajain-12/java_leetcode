import java.util.Scanner;

public class countvowel {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter word");
        String s = scn.nextLine(); 
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            count+=1;
                 }}
        }
        System.out.println("Vowels = " + count);
    }}
    

