public class secondlargestelement {
    public static void main(String[] args) {
        int arr[] = {1,2,5,7,6,5,4,10};
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondlargest&&arr[i]!=largest){
                secondlargest = arr[i];
            }
        }
        if(secondlargest==Integer.MIN_VALUE){
            System.out.println("element do not exist");
        }
        else{
            System.out.println("the second largest element is :" + secondlargest);
        }
    }
    
}
