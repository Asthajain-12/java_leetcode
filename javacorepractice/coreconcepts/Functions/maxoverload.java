public class maxoverload {
    public static int max(int a,int b){
        if(a>b){
            return a;
        }
        return b;
    }
    public static int max(int a,int b, int c){
        if(a>=b && a>=c){
            return a;
        }
        else if(b>=a && b>=c){
            return b;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(max(2,4));
        System.out.println(max(10,7,6));
    }


    
}
