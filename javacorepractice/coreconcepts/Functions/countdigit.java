

public class countdigit {
    static int countdigit(int n){
        int dig =0;
        while(n!=0){
            int q = n%10;
            dig++;
            n = n/10;
        }
        return dig;
    }
    public static void main(String[] args) {
        int result = countdigit(12345);
        System.out.println(result);
    }
    
}
