package levelSeven;

public class ShortestWord {
    public static void main(String[] args) {
        System.out.println(shortestWord("Tell me which is the shortest word."));
    }

    static String shortestWord(String str) {
        String[] words = str.split(" ");
        String shortestWord = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < shortestWord.length()) {
                shortestWord = words[i];
            }
        }
        return shortestWord;
    }
}
