public class diamond {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++){
            for(int space=1; space<=5-i; space++){
                System.out.print(" ");
            }
            for(int star=1; star<=2*i-1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int j=1; j<=5-1; j++){
            for(int space=1; space<=j; space++){
                System.out.print(" ");
            }
            for(int star=1; star<=2*(5-j)-1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
