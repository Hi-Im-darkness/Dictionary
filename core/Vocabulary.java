package core;


import java.util.HashMap;
import java.util.ArrayList;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;

import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Vocabulary implements Serializable {
    private HashMap<String, Meaning> storage;
    private String name;
    private ArrayList<String> imageDir, pathXls;


    public Vocabulary(String _name) {
        name = _name;
        storage = new HashMap<>();
        imageDir = new ArrayList<>();
        pathXls = new ArrayList<>();
    }

    public void setName(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }
    
    public ArrayList<String> gerImageDir() {
        return imageDir;
    }

    public HashMap<String, Meaning> getStorage() {
        return storage;
    }

    public String[] getKeyword() {
        return storage.keySet().toArray(new String[0]);
    }

    public int size() {
        return storage.size();
    }

    public boolean empty() {
        return size() == 0;
    }

    public Meaning searchWord(String key) {
        key = key.trim().toLowerCase();
        return storage.get(key);
    }

    public void addWord(String word, String mean, String pronunciation) {
        word = word.trim().toLowerCase();
        storage.put(word, new Meaning(mean, pronunciation));

    }
   
    public int deleteWord(String key) {
        Meaning check = storage.remove(key);
        if (check == null)
            return 404;
        return 0;
    }

    public void merge(Vocabulary newData) {
        storage.putAll(newData.getStorage());
    }

    public int loadFromFile(String path) {
        try {
            FileInputStream fs = new FileInputStream(path);
            WorkbookSettings ws = new WorkbookSettings();
            ws.setEncoding("Cp1252");
            Workbook wb = Workbook.getWorkbook(fs, ws);
            Sheet sh = wb.getSheet("Sheet1");

            int nRows = sh.getRows();

            for (int row = 0; row < nRows; row++) {
                String word = sh.getCell(0, row).getContents();
                String pronunciation = sh.getCell(1, row).getContents();
                String mean = sh.getCell(2, row).getContents();
                addWord(word, mean, pronunciation);
            }
            wb.close();
            File tmp = new File(path);
            setName(tmp.getName().replace(".xls", ""));
            imageDir.add(tmp.getAbsoluteFile().getParent());
            pathXls.add(path);
            return 0;
        } catch (Exception e) {
            return 404;
        }
    }

    public void writeToFile(String path) {
        try {
            WritableWorkbook wworkbook = Workbook.createWorkbook(new FileOutputStream(path));
            WritableSheet wsheet = wworkbook.createSheet("Sheet1", 0);

            int pos = 0;
            for (String word: storage.keySet()) {
                Label wordLabel = new Label(0, pos, word);
                Meaning tmp = storage.get(word);
                Label meanLabel = new Label(2, pos, tmp.getMean());
                Label pronunLabel = new Label(1, pos, tmp.getPronunciation());
                pos++;
                wsheet.addCell(wordLabel);
                wsheet.addCell(meanLabel);
                wsheet.addCell(pronunLabel);
            }

            wworkbook.write();
            wworkbook.close();
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
    
    public ArrayList<String> getInfo() {
        ArrayList<String> res = new ArrayList<>();
        res.add(name);
        res.add(String.format("%d", size()));
        String tmp = "<html>";
        for (String p: pathXls)
            tmp += p + "<br>";
        tmp += "</html>";
        res.add(tmp);
        return res;
    }

    public static void main(String[] args) throws Exception {
        Vocabulary d1 = new Vocabulary("d1"), d2 = new Vocabulary("d2");
        // d1.loadFromFile("fruit.xls");
        // d2.loadFromFile("animals.xls");
        // d1.merge(d2);
        // d1.addWord("hello", "chào");
        // System.out.println(d1.searchWord("hello"));
        // d1.writeToFile("o.xls");

        d1.loadFromFile("newFruit.xls");
        d2.loadFromFile("animals.xls");
        System.out.println(d2);
        // System.out.println(d1.searchWord("apple"));
        d2.merge(d1);
        for (String w: d1.getKeyword())
            System.out.println(w);
   //     d1.writeToFile("o.xls");
    }
}
