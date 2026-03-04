

public class reverse {
    static int reverse(int n){
        int rev = 0;
        while(n!=0){
            int q = n%10;
             rev = rev * 10 + q;
            n = n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int result = reverse(1234);
        System.out.println(result);
    }
    
}
