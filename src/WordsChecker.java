import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;
    protected Set<String> wordsSet = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text;
        String words[] = text.split("\\P{IsAlphaBetic}+");
        for (String word : words) {
            wordsSet.add(word);
        }
    }

    public boolean hasWord(String word) {
        return wordsSet.contains(word);
    }
}