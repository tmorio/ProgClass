class Circle extends Shape{
    protected int r;

    Circle(int x, int y ,String color, int r){
        super(x,y,color);
        this.r = r;
    }

    @Override
    void showInfo() {
        System.out.println("---------------円---------------");
        System.out.println("図形の位置 : (" + x + "," + y + ")");
        System.out.println("図形の色 : " + color);
        System.out.println("円の半径 : " + r);
    }
}