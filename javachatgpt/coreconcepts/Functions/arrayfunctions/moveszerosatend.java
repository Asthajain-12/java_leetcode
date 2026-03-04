
import java.util.Arrays;
public class moveszerosatend {
    public static void move(int[] arr ,int x){
        int pos =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]!=x){
                arr[pos] =arr [i];
                pos++;
            }
        }
            while(pos< arr.length){
                arr[pos] = x;
                pos++;

            }
        } 
    public static void main(String[] args) {
        int [] arr = {1,0,1,0,0,2,3};
        int x = 0;
        System.out.println("original aaray" + Arrays.toString(arr));
        move(arr,x);
        System.out.println("after moving" + " " + x + "=" + Arrays.toString(arr));
        }
    }
    

