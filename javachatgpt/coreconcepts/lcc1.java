import java.util.Scanner;
public class lcc1 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter size:");
    int n = scn.nextInt();
    int arr[] = new int[n];
    for(int i =0; i<n; i++){
        arr[i] = scn.nextInt();
    }
    System.out.println("Enter target:");
    int target = scn.nextInt(); 
    for(int start = 0; start<n; start++){
        for(int j = start+1; j<n; j++){
        if(arr[start] + arr[j] == target){
            System.out.println("arr" +"["+start+"]"+","+"arr" +"["+ j+"]");
        }
    }
}
}
}
        
