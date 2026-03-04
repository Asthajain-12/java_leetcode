public class methodoverloading {
    public static int add(int a, int b){
            return a+b;
        }
      public static int add(int a, int b, int c){
            return a+b+c;
    }
    public static void main(String[] args) {
        int result1 = add(2,3);
        int result2 = add(2,3,4);
        System.out.println(result1);
        System.out.println(result2);
    }

}
    

