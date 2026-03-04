public class patterndiff {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int space=1; space<=i-1; space++){
                System.out.print(" ");
            }
            for(int star=1; star<=5-i+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    
}
}
