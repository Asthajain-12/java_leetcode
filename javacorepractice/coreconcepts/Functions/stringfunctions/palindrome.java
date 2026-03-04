

public class palindrome {
    public static boolean ispallindrome(String s) {
        String rev = "";
        for(int i=s.length()-1; i>=0; i--){
            rev = rev+s.charAt(i);
        }
        if(s.equals(rev)){
            return true;
        }
        return false;
        
    }

    public static void main(String[] args) {
        String s = "ABc";
        boolean result = ispallindrome(s);
        System.out.println(result);
    }
}
