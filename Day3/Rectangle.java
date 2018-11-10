class Rectangle extends Shape{
    protected int weight;
    protected int height;

    Rectangle(int x, int y, String color, int weight, int height){
        super(x,y,color);
        this.weight = weight;
        this.height = height;
    }

    @Override
    void showInfo() {
        System.out.println("-------------四角形-------------");
        System.out.println("図形の位置 : (" + x + "," + y + ")");
        System.out.println("図形の色 : " + color);
        System.out.println("四角形の高さ : " + height);
        System.out.println("四角形の横幅 : " + weight);
    }

}