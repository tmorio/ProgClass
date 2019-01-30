class Point {
    private int x;
    private int y;

    Point(){
        x = 0;
        y = 0;

    }

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    int getX(){
        return x;
    }
    int getY() { return y; }

    void showPoint(){
        System.out.println("点の座標: (" + x + "," + y +")");
    }
}
