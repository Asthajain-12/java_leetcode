public class CountSubstringSameEnds {
    public static void main(String[] args) {
        String s = "ABA";
        int count = 0;
        for(int i =0; i<s.length(); i++){
            for(int j = i+1; j<=s.length(); j++){
                if(s.charAt(i)==s.charAt(j-1)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
}
