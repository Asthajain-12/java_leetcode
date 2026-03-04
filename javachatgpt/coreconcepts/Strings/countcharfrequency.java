import java.util.Scanner;
public class countcharfrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = "PROGRAM";
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            boolean alreadyseen = false;
            for(int k=0; k<i; k++){
                if(s.charAt(k)==ch){
                    alreadyseen = true;
                break;
            }
        }
            if(alreadyseen){
                continue;
            }
            int count = 0;
            for(int j = 0; j<s.length(); j++){
            if(s.charAt(j)==ch){
                count++;
            }

        }
        System.out.println(ch + " : " + count);
    }
}
}
        