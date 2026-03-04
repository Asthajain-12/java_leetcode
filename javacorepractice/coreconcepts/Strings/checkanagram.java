public class checkanagram {
    public static void main(String[] args) {
        String s1 = "ASTHA";
        String s2 = "ATHSA";
        if(s1.length() != s2.length()){
        System.out.println("length is not equal NOT ANAGRAM");
        return;
    }
        boolean isanagram = true;
        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            boolean alreadyseen = false;
            for(int k = 0; k < i ; k++){
                if(s1.charAt(k)==ch){
                alreadyseen = true;
                break; 
            }}
            if(alreadyseen){
                continue;
            }
             int s1count =0;
            for(int j=0; j<s1.length(); j++){
                if(s1.charAt(j)==ch){
                    s1count++;
                }
            }
            int s2count = 0;
             for(int j=0; j<s2.length(); j++){
                if(s2.charAt(j)==ch){
                    s2count++;
                }
            }
            if(s1count!=s2count){
                isanagram = false;
                break;
            }}
            if(isanagram){
                System.out.println("anagram");
            }
            else{
                System.out.println("not anagram");
            }
    
}
    }