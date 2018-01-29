package Database;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GameCard {
    java.util.List<RhymingGroup> setOfWords;

    void addGroup(RhymingGroup group){
        setOfWords.add(group);
    }

    void displayCard(){
        for(RhymingGroup group : setOfWords){
            System.out.println("This is a group:");
            group.display();

        }
    }

    public GameCard(){
        setOfWords = new java.util.ArrayList<RhymingGroup>();
    }

    public static void importCard() throws IOException{
        BufferedReader file = new BufferedReader(new FileReader("testCard.txt"));
        String line;
        String nextLine;
        GameCard card = new GameCard();
        RhymingGroup rhyme1 = new RhymingGroup();
        RhymingGroup rhyme2 = new RhymingGroup();
        RhymingGroup rhyme3 = new RhymingGroup();
        RhymingGroup rhyme4 = new RhymingGroup();
        String[] split;



        int i = 0;
        while((line = file.readLine()) != null){
            if(line.contains("#")){
                i++;
                line = file.readLine();
                split = line.split(", ");
                Word word = new Word(split[0], true, split[1]);
                if(i == 1){
                    rhyme1.addWord(word);
                }
                else if(i == 2){
                    rhyme2.addWord(word);
                }
                else if(i == 3){
                    rhyme3.addWord(word);
                }
                else{
                    rhyme4.addWord(word);
                }

            }
            else{
                split = line.split(", ");
                Word word = new Word(split[0], false, split[1]);

                if(i == 1){
                    rhyme1.addWord(word);
                }
                else if(i == 2){
                    rhyme2.addWord(word);
                }
                else if(i == 3){
                    rhyme3.addWord(word);
                }
                else{
                    rhyme4.addWord(word);
                }
            }
            //System.out.println(word);
            //System.out.println(line);
            //System.out.println(line = file.readLine());
            //System.out.println("This is the end of while");

            //System.out.println("Test");

        }

        file.close();
        card.addGroup(rhyme1);
        card.addGroup(rhyme2);
        card.addGroup(rhyme3);
        card.addGroup(rhyme4);

        card.displayCard();

    }
}
