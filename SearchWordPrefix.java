import java.util.Scanner;

public class SearchWordPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String searchWord = sc.nextLine();
        SearchWordPrefix wordPrefix = new SearchWordPrefix();
        int output = wordPrefix.isPrefixOfWord(userInput,searchWord);
        System.out.println("Index of word : "+output);

    }

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}
