public class binarysearch {
    public static int search(int[] arr,int target){
        int left =0;
        int right = arr.length-1;
        while(left<=right){
           int mid = (left+right)/2;
           if(arr[mid]==target){
            return mid;
           }
           else if(target>arr[mid]){
            left = mid+1;
           }
           else{
            right = mid-1;
           }
        }
        return -1;
            }
            public static void main(String[] args) {
                int[] arr = {1,2,5,6,8};
                int target = 5;
                int result = search(arr,target);
                System.out.println(result);
            }
        }