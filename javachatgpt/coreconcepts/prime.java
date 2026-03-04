import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); 
        for(int num = 1; num<=n; num++){
        int count =0 ;       
        for(int i=1; i<=n; i++){
            if(num%i==0){
                count++;
            }
        }
            if(count==2){
                System.out.println(num);
            }
        }
            
            }
            


        }
        
    
    

