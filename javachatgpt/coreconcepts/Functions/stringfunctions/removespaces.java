public class removespaces {
    public static String remove(String s){
        String result = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!= ' '){
                result = result+ s.charAt(i);
            }

        } 
        return result;
    }
    public static void main(String[] args) {
      String  s = "a s t h a";
      System.out.println(remove(s));

    }
    
}
