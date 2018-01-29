package Database;

import java.io.File;

public class Word {
    String name;
    //char firstLetter;
    //RhymingGroup rhymingGroup;
    //hasButton is True if there is a physical button for this word.
    Boolean hasButton;

    File image;
    //File voiceOver;

    public Word(String title, Boolean keyWord, String fileName){
        name = title;
        hasButton = keyWord;
        image = new File(fileName);
    }

    void display(){
        System.out.println(name);
        System.out.println(image);
    }




}
