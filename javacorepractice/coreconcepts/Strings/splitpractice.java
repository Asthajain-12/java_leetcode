public class splitpractice {
    public static void main(String[] args) {
        String s = "I LOVE JAVA PROGRAMING";
        
        String[] word = s.split(" ") ;
        int count = 0;
        for(int i=0; i<word.length; i++){
            System.out.println(word[i]);
            count++;
        }
        System.out.println(count);

    }
    
}
