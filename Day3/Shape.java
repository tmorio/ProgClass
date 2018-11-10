abstract class Shape {
    protected int x;
    protected int y;
    protected String color;

    Shape(int x, int y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    abstract void showInfo();
}
