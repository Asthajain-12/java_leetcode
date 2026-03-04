public class spacepattern {
    public static void main(String[] args) {
        for(int i= 1; i<=5; i++){
            for(int star = 1; star<=i-1; star++)
            {
                System.out.print(" ");
        }
                for(int j=1; j<=5-i+1; j++){
                    System.out.print("*");
            }
            
        System.out.println();
    }
    
}
}
