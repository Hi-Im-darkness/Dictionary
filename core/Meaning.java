package core;

import java.io.Serializable;

public class Meaning implements Serializable {
    private String mean, pronunciation;

    public Meaning(String _mean, String _pronunciation) {
        mean = _mean;
        pronunciation = _pronunciation;
    }

    public String getMean() {
        return mean;
    }

    public String getPronunciation() {
        return pronunciation;
    }
    
    @Override
    public String toString() {
        String meanStr = String.format("%-15s:%15s%n", "Mean", mean);
        String proStr = String.format("%-15s:%15s%n", "Pronunciation", pronunciation);
        return meanStr + proStr;
    }
}
