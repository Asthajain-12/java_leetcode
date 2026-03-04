public static void main(String[] args) {
    String s = "ABA";
    
    for(int i=0; i<s.length();i++){
        for(int j=i+1; j<=s.length(); j++){
        String  sub = s.substring(i,j);
        System.out.println(sub);
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
                System.out.println("palindrome");
            }
            else{
                System.out.println("not palindrome");
            }
            
            }
            
         }

        }
    }
    
        
    
    

