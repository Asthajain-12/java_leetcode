public class lastcoccurence {
    public static int lastoccur(int[] arr,int target ){
        int left =0;
        int right = arr.length-1;
       int ans = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
            ans = mid;
            left = mid+1;
            }
            else if(target<arr[mid]){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
            return ans;
        }
        public static void main(String[] args){
            int[] arr = {1,2,2,2,3};
            int target = 2;
            int result = lastoccur(arr,target);
            System.out.println(result);
        }
    }
    

