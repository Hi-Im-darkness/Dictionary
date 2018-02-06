package core;

import java.util.ArrayList;

public class Reference {
    private History history;
    private VocabularyManager data;

    public Reference() {
        history = History.getInstance();
        data = VocabularyManager.getInstance();
    }

    public ArrayList<Object[]> searchWord(String key) {
        ArrayList<Object[]> res = new ArrayList<Object[]>();
        for (Vocabulary walk: data) {
            Meaning mean = walk.searchWord(key);
            if (mean != null)
                res.add(new Object[] {mean, walk});
        }
        if (res.size() != 0)
            history.add(key);
        
        return res;
    }
    
    public Meaning simpleSearchWord(String key) {
        for (Vocabulary walk: data) {
            Meaning mean = walk.searchWord(key);
            if (mean != null)
                return mean;
        }
        return null;
    }

    public static void main(String[] args) /* throws Exception */ {
    	VocabularyManager D = VocabularyManager.getInstance();
        System.out.println(D.listVocabulary());

        Reference R = new Reference();
        for (Object[] res: R.searchWord("apple"))
            System.out.println(res[0] + "Found in: " + res[1]);
//        R.searchWord("orange");
//        R.searchWord("lemon");
//        R.searchWord("peach");
//        R.searchWord("apple");
//
//        System.out.println();
//        for (String s: D.vocAt(0).getKeyword())
//            System.out.println(s);
//        for (String s: D.vocAt(1).getKeyword())
//            System.out.println(s);
//
//        System.out.println();
    }
}
