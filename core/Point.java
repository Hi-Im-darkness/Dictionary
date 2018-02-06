package core;

public class Point {
    private int value;
    
    private static Point instance = new Point();
    
    private Point() {
        value = 0;
    }
    
    public static Point getInstance() {
        return instance;
    }
    
    public void increasePoint() {
        value++;
    }
    
    public void resetPoint() {
        value = 0;
    }
    
    public int getPoint() {
        return value;
    }
}
