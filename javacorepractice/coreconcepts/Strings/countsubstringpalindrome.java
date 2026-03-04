public class countsubstringpalindrome {
    public static void main(String[] args) {
    String s = "ABA";
    int count = 0;
    for(int i=0; i<s.length();i++){
        for(int j=i+1; j<=s.length(); j++){
        String  sub = s.substring(i,j);
         int left =0;
         int right = sub.length()-1;
         boolean isPalindrome = true;
         while(left<right){
            if(sub.charAt(left)!=(sub.charAt(right))){
            isPalindrome = false;
            break;}
            left++;
            right--;
            }
            if(isPalindrome){
                count++;
            }
            
            }
        
            
         }
         System.out.println(count);

        }
    }
    
        
    
    



    

