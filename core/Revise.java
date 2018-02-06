package core;

import java.util.HashSet;
import java.util.Random;

public class Revise {
    private static Random randomMachine = new Random();
    
    private History history;
    private VocabularyManager data;
    
    public Revise() {
        data = VocabularyManager.getInstance();
        history = History.getInstance();
    }
    
    public String[] randomWord(int nWords) {
        HashSet<String> res = new HashSet<>();
        while (res.size() < nWords) {
            int vocPos = 0;
            do {
                vocPos = randomMachine.nextInt(data.size());
            } while (data.vocAt(vocPos).size() == 0);
            String[] keyWord = data.vocAt(vocPos).getKeyword();
            int wordPos = randomMachine.nextInt(keyWord.length);
            res.add(keyWord[wordPos]);
        }
        return res.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Revise R = new Revise();
        for (String s: R.randomWord(5)) {
            System.out.println(s);
        }
    }
}
