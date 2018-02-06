package core;


import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;

public class VocabularyManager implements Iterable<Vocabulary>, Serializable {
    private static final String path = "data/vocabulary.dat";

    private ArrayList<Vocabulary> data;

    private static VocabularyManager instance = new VocabularyManager();
    
    private VocabularyManager() {
    	load();
    }

    public static VocabularyManager getInstance() {
        return instance;
    }

    public int size() {
        return data.size();
    }

    public boolean empty() {
        return size() == 0;
    }
    
    public void dumb() {
        try {
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(data);
            objectOut.close();
        } catch (Exception e) {
            return;
        }
    }

    public void load() {
        try {
            FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            data = (ArrayList<Vocabulary>)objectIn.readObject();
            objectIn.close();
        } catch (Exception e) {
            System.out.println(e);
            data = new ArrayList<>();
        }
    }
    
    public ArrayList<String> getListKey() {
        ArrayList<String> res = new ArrayList<>();
        for (Vocabulary walk: data) {
            for (String key: walk.getKeyword())
                res.add(key);
        }
        Collections.sort(res);
        return res;
    }

    public String[] listVocabulary() {
    	ArrayList<String> res = new ArrayList<>();
    	for (Vocabulary walk: data)
    	    res.add(walk.getName());
    	return res.toArray(new String[0]);
    }

    public void addVocabulary(String name) {
    	data.add(new Vocabulary(name));
    }

    public void addVocabulary() {
        data.add(new Vocabulary("Voc" + System.currentTimeMillis()));
    }

    public void removeVocabulary(int index) {
    	data.remove(index);
    }

    public Vocabulary vocAt(int index) {
        return data.get(index);
    }

    public Iterator<Vocabulary> iterator() {
        return data.iterator();
    }
    
    public static void main(String[] args) {
    	VocabularyManager D = VocabularyManager.getInstance();
        D.addVocabulary();
        D.addVocabulary();
        D.vocAt(0).loadFromFile("newFruit.xls");
        D.vocAt(1).loadFromFile("animals.xls");
        System.out.println(D.listVocabulary());
        for (String s: D.getListKey())
                System.out.println(s);
        D.dumb();
    }
}
