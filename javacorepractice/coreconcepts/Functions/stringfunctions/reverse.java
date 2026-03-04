

public class reverse {
    public static String rev(String s){
        String reverse = "";  

        for(int i= s.length()-1; i>=0; i--){
            reverse = reverse+s.charAt(i);

        }
        return reverse;
    }
    public static void main(String[] args) {
        String s = "astha";
         String result = rev(s);
            System.out.println(result);
        }

    }
    

