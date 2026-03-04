public class maxconsecutive {
    public static int max(int[] arr){
        int count1 = 0;
        int maxcount= 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                count1++;
                if(count1>maxcount){
                    maxcount = count1;
            }}
            else{
                count1 = 0;
            }
        }
        return maxcount;
    }
        
        public static void main(String[] args) {
            int[] arr = {1,1,0,1,1,1};
            int result = max(arr);
            System.out.println(result);
        }   
    }
    

