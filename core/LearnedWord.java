package core;


import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;


public class LearnedWord implements Serializable {
    private String word;
    private Date date;
    
    LearnedWord(String _word, Date _date) {
        setWord(_word);
        setDate(_date);
    }
    
    public void setWord(String _word) {
        word = _word;
    }
    
    public String getWord() {
        return word;
    }
    
    public void setDate(Date _date) {
        date = _date;
    }
    
    public Date getDate() {
        return date;
    }
    
    public String getLocalDate() {
        return LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(date)).toString();
    }
    
    @Override
    public boolean equals(Object o) {
        LearnedWord w = (LearnedWord) o;
        return word.equals(w.getWord());
    }
    
    public static void main(String[] args) {
    }
}
