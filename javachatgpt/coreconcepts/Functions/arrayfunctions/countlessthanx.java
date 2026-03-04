

public class countlessthanx {
    public static int count(int[] arr, int x){
        int left = 0;
        int right = arr.length-1;
        int ans = arr.length;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]>=x){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int x = 5;
        int result = count(arr,x);
        System.out.println(result);
    }
    
}
