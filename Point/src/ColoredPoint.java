class ColoredPoint extends Point{
    String color;

    ColoredPoint(){
        super();
        color = "Black";
    }

    ColoredPoint(int x, int y, String color){
        super(x,y);
        this.color = color;
    }

    void showPoint(){
        System.out.println("点の座標: (" + getX() + "," + getY() + ")");
        System.out.println("点の色: " + color);
    }
}
