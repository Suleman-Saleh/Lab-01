package Week_5_inheritance;

public class Shape {
    static int x = 10;
    protected int y = 1;
    Point centrepoint;

    protected double calArea(){
        return 0;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public String toString(){
        return String.valueOf(y);
    }
    public static int min(int y, int x){
        return x>y?x:y;
    }
    public final int sum(int a, int b){
        return a+b;
    }
}
