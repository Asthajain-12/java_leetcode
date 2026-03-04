public class countodd {
    static int count(int[] arr){
        int odd = 0;
        for(int i=0; i<arr.length; i++){
        if(arr[i]%2!=0){
            odd++;
        }}
        return odd;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8} ;
        int result = count(arr);
        System.out.println(result);
    }
}
