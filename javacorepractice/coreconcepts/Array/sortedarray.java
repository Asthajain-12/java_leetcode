public class sortedarray {
     public static void main(String args[]) {
    int arr[] = {1,2,3,4};
    //check sorted array using loop
    boolean issorted = true;
    for(int i = 0; i < arr.length-1; i++){
        if(arr[i]>arr[i+1]){
            issorted = false;
            break;
            }}
            if(issorted){
                System.out.println("Sorted Array");
            }
            else{
                System.out.println("Not Sorted Array");
            }
}
}