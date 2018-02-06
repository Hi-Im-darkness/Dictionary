package core;

public class Dictionary {
    public VocabularyManager vMng;
    public History his;
    public Statistic sts;
    public Reference rfc;
    public Revise rvs;
    
    private static Dictionary instance = new Dictionary();
    
    public static Dictionary getInstance() {
        return instance;
    }
    
    private Dictionary() {
        vMng = VocabularyManager.getInstance();
        his = History.getInstance();
        sts = new Statistic();
        rfc = new Reference();
        rvs = new Revise();
    }
    
    public void exit() {
        his.dumb();
        vMng.dumb();
    }
    
    public static void main(String[] args) {
        
    }
}
