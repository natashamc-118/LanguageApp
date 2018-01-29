package Database;

public class RhymingGroup {
    List<Word> setOfRhymes;

    void addWord(Word word){
        setOfRhymes.add(word);
    }

    void removeWord(Word word){
        setOfRhymes.remove(word);
    }
}
//Figure out what file types are easiest for java.
