package core;

import java.util.ArrayDeque;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Date;


public class History {
    private static final String path = "data/history.dat";

    private ArrayDeque<LearnedWord> timeData;
    private HashMap<String, Date> spaceData;

    public static History instance = new History();

    private History() {
        load();
    }

    public static History getInstance() {
        return instance;
    }

    public int size() {
        return spaceData.size();
    }
    
    public int testSize() {
        return timeData.size();
    }

    public boolean empty() {
        return size() == 0;
    }
    
    public void clear() {
        timeData.clear();
        spaceData.clear();
    }
    
    public void deleteWord(String key) {
        while (timeData.remove(new LearnedWord(key, null)));
        spaceData.remove(key);
    }
    
    public void dumb() {
        try {
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(timeData);
            objectOut.writeObject(spaceData);
            objectOut.close();
        } catch (Exception e) {
            return;
        }
    }

    public void load() {
        try {
            FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            timeData = (ArrayDeque<LearnedWord>)objectIn.readObject();
            spaceData = (HashMap<String, Date>)objectIn.readObject();
            objectIn.close();
        } catch (Exception e) {
            System.out.println(e);
            timeData = new ArrayDeque<>();
            spaceData = new HashMap<>();
        }
    }
    
    public void add(String word) {
        Date date = new Date();
        timeData.addFirst(new LearnedWord(word, date));
        spaceData.put(word, date);
        
        int s = timeData.size();
        if (s >= 2 * spaceData.size()) {
            for (int count = 0; count < s; count++) {
                LearnedWord tmp = timeData.pollLast();
                if (spaceData.get(tmp.getWord()).equals(tmp.getDate()))
                    timeData.addFirst(tmp);
            }
        }
    }

    public Iterator<LearnedWord> iterator() {
        Iterator<LearnedWord> walk = timeData.iterator();
        Queue<LearnedWord> res = new LinkedList<>();
        while (walk.hasNext()) {
            LearnedWord w = walk.next();
            if (! spaceData.get(w.getWord()).equals(w.getDate()))
                continue;
            res.add(w);
        }
        return res.iterator();
    }

    public Iterator<LearnedWord> descendingIterator() {
        Iterator<LearnedWord> walk = timeData.descendingIterator();
        Queue<LearnedWord> res = new LinkedList<>();
        while (walk.hasNext()) {
            LearnedWord w = walk.next();
            if (! spaceData.get(w.getWord()).equals(w.getDate()))
                continue;
            res.add(w);
        }
        return res.iterator();
    }

    public static void main(String[] args) {
        History H = History.getInstance();
        
//        H.add("a", "12");
//        H.add("a");
//        H.deleteWord("a");
        H.add("brown");
        Iterator<LearnedWord> walk = H.iterator();
        while (walk.hasNext()) {
            LearnedWord w = walk.next();
            System.out.println(w.getWord() + " " + w.getLocalDate());
        }
        System.out.println(H.testSize());
//        System.out.println(H.poll());
//        System.out.println(H.size());
        
//        H.dumb();
    }
        
}
