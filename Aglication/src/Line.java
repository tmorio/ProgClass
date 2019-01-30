public class Line {
    Point p1;
    Point p2;

    public Line (Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getLength(){
        int x = p1.getX() - p2.getX();
        int y = p1.getY() - p2.getY();

        double length = Math.sqrt(x*x+y*y);
        return length;
    }

    public void showInfo(){
        System.out.print("始点: ");
        p1.showInfo();
        System.out.print("終点: ");
        p2.showInfo();
        System.out.println("長さ: " + getLength());
    }

    public void move(int dx, int dy){
        p1.move(dx,dy);
        p2.move(dx,dy);
    }
}
