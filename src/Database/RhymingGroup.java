package Database;

public class RhymingGroup {
    java.util.List<Word> setOfRhymes;

    void addWord(Word word){
        setOfRhymes.add(word);
    }

    void removeWord(Word word){
        setOfRhymes.remove(word);
    }

    void display(){
        System.out.println("They key word is:");
        setOfRhymes.get(0).display();
        System.out.println("Its rhymes are:");
        for(int i = 1; i < setOfRhymes.size(); i++){
            setOfRhymes.get(i).display();
        }
    }

    public RhymingGroup(){
        setOfRhymes = new java.util.ArrayList<Word>();
    }
}
//Figure out what file types are easiest for java.
