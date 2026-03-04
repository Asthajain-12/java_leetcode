

public class vowels {
    public static int count(String s) {
       int c =0;

       for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);


         if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            c++;
        }
       } }
       return c; 
    }
    public static void main(String[] args) {
        String s = "education";
        int result = count(s);
        System.out.println(result);
    }
}
