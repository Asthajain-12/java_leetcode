public class countsubstring {
    public static void main(String[] args) {
        String s = "ABC";
        int count =0;
        for(int i=0; i<s.length(); i++){
            for(int j = i+1; j<=s.length(); j++){
             count++;

            }
            

        }
        System.out.println(count);
        
    }
    
    
}
