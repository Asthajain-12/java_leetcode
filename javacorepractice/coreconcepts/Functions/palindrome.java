

public class palindrome {
    static String palindrome(int n){
        int original = n;
        int rev = 0;
        while(n!=0){
          int  q = n%10;
          rev = rev*10+q;
          n = n/10;
        }
        if( original == rev){
            return "palindrome";
        }
        else{
            return "not palindrome";
        }
    }
    public static void main(String[] args) {
        String result = palindrome(1234);
        System.out.println(result); 
    }
    
}
