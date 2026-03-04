public class reverseeachword {
    public static void main(String[] args) {
        String s = "I LOVE JAVA PROGRAMING";
    
    String[] words = s.split(" ");

    for(int i = 0 ; i<words.length; i++){
        String word = words[i];
        for(int j = word.length()-1; j>=0; j--){
            System.out.print(word.charAt(j));
        }
        System.out.println();
    }
    
}}
