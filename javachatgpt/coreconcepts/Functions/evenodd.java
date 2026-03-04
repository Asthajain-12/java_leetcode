

public class evenodd {
    static String evenodd(int n){
        if(n%2==0){
            return "even";
        }
        else{
            return "odd";
        }
    }
    public static void main(String[] args) {
        String result = evenodd(4);
        System.out.println(result);
    }
    
}
