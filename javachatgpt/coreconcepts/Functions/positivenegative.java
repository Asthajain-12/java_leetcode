

public class positivenegative {
    static String positivenegative(int n){
        if(n>=0){
            return "positive";
        }
        else{
            return "negative";
        }
    } 
    public static void main(String[] args) {
        String result = positivenegative(1);
        System.out.println(result);
    }
    
}
