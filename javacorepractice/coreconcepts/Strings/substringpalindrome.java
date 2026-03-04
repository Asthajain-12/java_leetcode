public class substringpalindrome {
    public static void main(String[] args) {
        String s = "ABA";
        int count = 0;
        boolean flag = true;
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                int left = 0;
                int right = s.length()-1;
                while(left<right){
                if(s.charAt(left)!=s.charAt(right)){
                    flag = false;
                    left++;
                    right--;
                    break;
                    
                }
                    
                }
                
            }
             if(flag){
                    count++;
                }
                else{
                    System.out.println("not palindrome");
                }
            
        }
       
                System.out.println(count);
                
    }
    
}

    

