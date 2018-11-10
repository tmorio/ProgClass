class Main{
    public static void main(String[] args){
        Shape circleA;
        Shape RectangleB;

        circleA = new Circle(5, 6, "Black", 5);
        RectangleB = new Rectangle(3,7,"Green",6,4);

        circleA.showInfo();
        RectangleB.showInfo();
    }
}