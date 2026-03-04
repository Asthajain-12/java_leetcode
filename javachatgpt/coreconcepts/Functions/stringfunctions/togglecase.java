public class togglecase {
    public static String toggle(String s){
        String result = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch>='a'&&ch<='z'){
                result = result + (char)(ch-32);
            }
            else if(ch>='A'&&ch<='Z'){
                result = result+(char)(ch+32);
            }
            else{
                result = result+s.charAt(i);
            }
        } 
        return result;
    }
    public static void main(String[] args) {
        String s = "AsTha";
        System.out.println(toggle(s));
    }
    
}
