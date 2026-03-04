

public class selectionsort {
    public static void selection(int[] arr){
        int n = arr.length;
        for(int i =0; i<n-1; i++){
        int smallestindex = i;
        for(int j =i+1; j<n; j++){
            if(arr[j]<arr[smallestindex]){
                smallestindex = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[smallestindex];
        arr[smallestindex] = temp;

    }}
    public static void main(String[] args) {
        int[] arr= {1,4,5,2,3};
        selection(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
