public class frequencyarray {
    static void frequency(int[] arr){
        for(int i=0; i<arr.length; i++){
            boolean duplicate = false;
            for(int k=0; k<i; k++){
                if(arr[k]==arr[i]){
                    duplicate = true;
                    break;
                }
            }
            if(duplicate){
                continue;
            }
            int count =0;
            for(int j=0; j<arr.length; j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
        System.out.println(arr[i]+"->"+count);
        }
        }
        public static void main(String[] args){
        int[] arr ={1,2,4,3,2,4};
         frequency(arr);
        
    }
    
}
