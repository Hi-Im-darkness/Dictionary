package core;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Statistic {
    private History history;
    private int widthWord;
    
    public Statistic() {
        history = History.getInstance();
    }
    
    public void setWidth(int _width) {
        widthWord = _width;
    }
    
    public String[] allLearnedWord() {
        ArrayList<String> res = new ArrayList<>();
        Iterator<LearnedWord> walk = history.iterator();
        int i = 0;
        while (walk.hasNext()) {
            LearnedWord w = walk.next();
            String s = String.format("%"+widthWord+"s%s", w.getWord(), w.getLocalDate());
            res.add(s);
        }
        return res.toArray(new String[0]);
    }

    public String[] recentWord(int nWords) {
        ArrayList<String> res = new ArrayList<>();
        Iterator<LearnedWord> walk = history.iterator();
        int i = 0;
        while (walk.hasNext()) {
            LearnedWord w = walk.next();
            String s = String.format("%"+widthWord+"s%s", w.getWord(), w.getLocalDate());
            res.add(s);
            i++;
            if (i == nWords)
                break;
        }
        return res.toArray(new String[0]);
    }

    public String[] oldestWord(int nWords) {
        ArrayList<String> res = new ArrayList<>();
        Iterator<LearnedWord> walk = history.descendingIterator();
        int i = 0;
        while (walk.hasNext()) {
            LearnedWord w = walk.next();
            String s = String.format("%"+widthWord+"s%s", w.getWord(), w.getLocalDate());
            res.add(s);
            i++;
            if (i == nWords)
                break;
        }
        Collections.reverse(res);
        return res.toArray(new String[0]);
    }

    public String[] wordSearchToday() {
        String today = LocalDate.now().toString();
        ArrayList<String> res = new ArrayList<>();
        Iterator<LearnedWord> walk = history.iterator();
        while (walk.hasNext()) {
            LearnedWord w = walk.next();            
            if (! w.getLocalDate().equals(today))
                break;
            String s = String.format("%"+widthWord+"s%s", w.getWord(), w.getLocalDate());
            res.add(s);
        }
        return res.toArray(new String[0]);
    }

    public static void main(String[] args) {
        VocabularyManager D = VocabularyManager.getInstance();
        History H = History.getInstance();

        Statistic S = new Statistic();
//        for (Object[] res: R.searchWord("apple"))
//            System.out.println(res[0] + "Found in: " + res[1]);
//        R.searchWord("orange");
//        R.searchWord("lemon");
//        R.searchWord("peach");
//        R.searchWord("apple");

        for (String s: S.allLearnedWord()) {
            System.out.println(s);
        }
    }
}
