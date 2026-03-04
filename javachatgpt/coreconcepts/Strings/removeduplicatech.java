public class removeduplicatech {
    public static void main(String[] args) {
        String s = "PROGRAM";
        for(int i =0 ; i<s.length(); i++){
            char ch = s.charAt(i);
           boolean duplicate = false;
        for(int k = 0; k<i; k++){
            if(s.charAt(k)==ch){
                duplicate = true;
                break;
            }
            
            }
         if(!duplicate){
            System.out.println(ch);
         }
    }
}}

